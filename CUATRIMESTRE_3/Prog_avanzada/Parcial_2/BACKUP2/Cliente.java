package parcial2;

import java.sql.*;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String numeroCuenta;
    private String contraseña;
    private double saldo;

    public Cliente(String numeroCuenta, String contraseña) {
        this.numeroCuenta = numeroCuenta;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public static boolean registrarCliente() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingresa tu número de cuenta: ");
        String numeroCuenta = sc.nextLine();
        
        System.out.print("Ingresa tu contraseña: ");
        String contraseña = sc.nextLine();
        
        Connection conn = Conexion.obtenerConexion();
        
        if (conn == null) {
            System.out.println("Error al conectar con la base de datos.");
            return false;
        }
        
        try {
            String query = "INSERT INTO clientes (nombre, numero_cuenta, saldo, contraseña) VALUES (?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, nombre);
            ps.setString(2, numeroCuenta);
            ps.setDouble(3, 0.0); // Saldo inicial
            ps.setString(4, contraseña);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Usuario registrado exitosamente.");
                return true;
            } else {
                System.out.println("Error al registrar al usuario.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    
    public static  Cliente iniciarSesion() {
        Scanner sc = new Scanner(System.in);

        // Solicitar número de cuenta y contraseña
        System.out.print("Ingresa tu número de cuenta: ");
        String numeroCuentaInput = sc.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contraseñaInput = sc.nextLine();

        Connection conn = Conexion.obtenerConexion();
        
        try {
            String query = "SELECT nombre, saldo FROM clientes WHERE numero_cuenta = ? AND contraseña = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, numeroCuentaInput);
            ps.setString(2, contraseñaInput);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // Crear un objeto Cliente con los datos obtenidos de la base de datos
                Cliente cliente = new Cliente(numeroCuentaInput, contraseñaInput);
                cliente.nombre = rs.getString("nombre");
                cliente.saldo = rs.getDouble("saldo");
                
                return cliente;
            } else {
                System.out.println("Número de cuenta o contraseña incorrectos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean realizarTransferencia(String cuentaDestino, double monto) {
        if (monto <= 0 || saldo < monto) return false;
        
        Connection conn = Conexion.obtenerConexion();
        
        try {
            // Actualizar saldo del cliente actual
            String query1 = "UPDATE clientes SET saldo = saldo - ? WHERE numero_cuenta = ?";
            PreparedStatement ps1 = conn.prepareStatement(query1);
            ps1.setDouble(1, monto);
            ps1.setString(2, numeroCuenta);
            
            int rowsAffected1 = ps1.executeUpdate();

            // Actualizar saldo de la cuenta destino
            String query2 = "UPDATE clientes SET saldo = saldo + ? WHERE numero_cuenta = ?";
            PreparedStatement ps2 = conn.prepareStatement(query2);
            ps2.setDouble(1, monto);
            ps2.setString(2, cuentaDestino);
            
            int rowsAffected2 = ps2.executeUpdate();

            if (rowsAffected1 > 0 && rowsAffected2 > 0) {
                saldo -= monto;
                registrarTransaccion("transferencia", monto);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void registrarTransaccion(String tipo, double monto) {
        Connection conn = Conexion.obtenerConexion();
        try {
            String query = "INSERT INTO transacciones (numero_cuenta, tipo, monto) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, numeroCuenta);
            ps.setString(2, tipo);
            ps.setDouble(3, monto);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void opcionesCliente(Cliente cliente, CajeroAutomatico cajero) {
        Scanner sc = new Scanner(System.in);
        
        if (cliente == null) {
            System.out.println("No se pudo iniciar sesión. Saliendo...");
            return;
        }

        while (true) {
        	 System.out.println("Seleccione una opción:");
             System.out.println("1. Ver saldo");
             System.out.println("2. Realizar depósito");
             System.out.println("3. Realizar retiro");
             System.out.println("4. Realizar transferencia");
             System.out.println("6. Ver movimientos");
             System.out.println("6. Salir");
             
             int opcion = sc.nextInt();

             switch (opcion) {
                 case 1:
                     // Ver saldo en la cuenta del cliente
                     System.out.println("Saldo actual: " + cliente.getSaldo());
                     break;
                 case 2:
                     System.out.print("Ingresa el monto a depositar: ");
                     double montoDeposito = sc.nextDouble();
                     // Realizar depósito
                     if (cajero.realizarDeposito(cliente, montoDeposito)) {
                         System.out.println("Depósito exitoso.");
                     } else {
                         System.out.println("Error al realizar el depósito.");
                     }
                     break;
                 case 3:
                     System.out.print("Ingresa el monto a retirar: ");
                     double montoRetiro = sc.nextDouble();
                     // Realizar retiro
                     if (cajero.realizarRetiro(cliente, montoRetiro)) {
                         System.out.println("Retiro exitoso.");
                     } else {
                         System.out.println("Error al realizar el retiro.");
                     }
                     break;
                 case 4:
                     System.out.print("Ingresa el número de cuenta de destino: ");
                     String cuentaDestino = sc.next();
                     System.out.print("Ingresa el monto a transferir: ");
                     double montoTransferencia = sc.nextDouble();
                     // Realizar transferencia
                     if (cajero.realizarTransferencia(cliente, cuentaDestino, montoTransferencia)) {
                         System.out.println("Transferencia exitosa.");
                     } else {
                         System.out.println("Error al realizar la transferencia.");
                     }
                     break;
                 case 5:
                	 cliente.verMovimientos();
                	 break;
                 case 6:
                     System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                     return;
                 default:
                     System.out.println("Opción no válida.");
             }
        }
    }
    
    
    public void verMovimientos() {
        // Obtener la cuenta directamente desde el objeto Cliente (ya inicializada)
        String cuentaCliente = this.numeroCuenta;  // Usamos el atributo cuenta del objeto

        // Obtener la conexión a la base de datos
        Connection conn = Conexion.obtenerConexion();

        // Consulta SQL para obtener los movimientos de la cuenta
        String query = "SELECT * FROM transacciones WHERE numero_cuenta = ? OR cuenta_destino = ? ORDER BY fecha DESC";

        try {
            // Preparar la consulta
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, cuentaCliente);  // Filtrar por cuenta de origen
            ps.setString(2, cuentaCliente);  // Filtrar por cuenta de destino

            // Ejecutar la consulta
            ResultSet rs = ps.executeQuery();

            // Mostrar los movimientos
            System.out.println("Movimientos de la cuenta " + cuentaCliente + ":");

            boolean tieneMovimientos = false;  // Para saber si se encontraron movimientos

            while (rs.next()) {
                int id = rs.getInt("id");
                
                String cuentaOrigen = rs.getString("numero_cuenta");
                String cuentaDestino = rs.getString("cuenta_destino");
                
                double monto = rs.getDouble("monto");
                
                String tipoTransaccion = rs.getString("tipo");
                
                Timestamp fecha = rs.getTimestamp("fecha");

                // Mostrar el detalle de la transacción
                System.out.println("ID: " + id);
                System.out.println("Cuenta Origen: " + cuentaOrigen);
                System.out.println("Cuenta Destino: " + cuentaDestino);
                System.out.println("Monto: $" + monto);
                System.out.println("Tipo de Transacción: " + tipoTransaccion);
                System.out.println("Fecha: " + fecha);
                System.out.println("-----------------------------------");

                tieneMovimientos = true;  // Marcar que se encontraron movimientos
            }

            // Si no hay movimientos
            if (!tieneMovimientos) {
                System.out.println("Usted no tiene movimientos para la cuenta " + cuentaCliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
