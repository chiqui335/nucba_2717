package parcial_2;

import java.sql.*;
import java.util.Scanner;

public class Cliente {
    private static String nombre;
    private static String numeroCuenta;
    private static String contraseña;
    private static double saldo;
    
    

    public Cliente(String numeroCuenta, String contraseña) {
        this.numeroCuenta = numeroCuenta;
        this.contraseña = contraseña;
        }

    public static String getNombre() {
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
            
            ps.setString (1, nombre);
            ps.setString (2, numeroCuenta);
            ps.setDouble (3, 0.0);
            ps.setString (4, contraseña);
            
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
    
    
    
    public static Cliente iniciarSesion() {
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
                
            	// Asignar valores a los atributos del objeto actual
                nombre = rs.getString("nombre");
                saldo = rs.getDouble("saldo");
                numeroCuenta = numeroCuentaInput;
                contraseña = contraseñaInput;
                
                Cliente cliente = new Cliente(numeroCuentaInput, contraseñaInput);
                
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


    public static void opcionesCliente(Cliente cliente) {
        Scanner sc = new Scanner(System.in);
        
        if (cliente == null) {
            System.out.println("No se pudo iniciar sesión. Saliendo...");
            return;
        }

        while (true) {
            System.out.println("\n¿Qué te gustaría hacer?");
            System.out.println("1. Ver saldo");
            System.out.println("2. Hacer un depósito");
            System.out.println("3. Hacer un retiro");
            System.out.println("4. Realizar una transferencia");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Ver saldo en la cuenta del cajero automático
                    System.out.println("Saldo actual: " + CajeroAutomatico.obtenerSaldo(cliente)); //cliente en vez de this
                    break;
                case 2:
                    System.out.print("Ingresa el monto a depositar: ");
                    double montoDeposito = sc.nextDouble();
                    // Realizar depósito usando el método del cajero automático
                    if (CajeroAutomatico.realizarDeposito(cliente, montoDeposito)) {
                        System.out.println("Depósito exitoso.");
                    } else {
                        System.out.println("Error al realizar el depósito.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el monto a retirar: ");
                    double montoRetiro = sc.nextDouble();
                    // Realizar retiro usando el método del cajero automático
                    if (CajeroAutomatico.realizarRetiro(cliente, montoRetiro)) {
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
                    // Realizar transferencia usando el método del cajero automático
                    if (CajeroAutomatico.realizarTransferencia(cliente, cuentaDestino, montoTransferencia)) {
                        System.out.println("Transferencia exitosa.");
                    } else {
                        System.out.println("Error al realizar la transferencia.");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    } 
}

