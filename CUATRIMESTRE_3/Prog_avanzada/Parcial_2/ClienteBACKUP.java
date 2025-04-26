package CUATRIMESTRE_3.Prog_avanzada.Parcial_2;

import java.sql.*;
import java.util.Scanner;


//BACKUP DE CLIENTE DEL PARCIAL 2 PROG AVANZADA
public class ClienteBACKUP {
    private String nombre;
    private String numeroCuenta;
    private String contraseña;
    private double saldo;

    public ClienteBACKUP(String numeroCuenta, String contraseña) {
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
    
    public boolean registrarUsuario() {
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
    
    
    
    public boolean iniciarSesion() {
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
                return true;
            } else {
                System.out.println("Número de cuenta o contraseña incorrectos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    

    public double obtenerSaldo() {
        return saldo;
    }

    public boolean realizarDeposito(double monto) {
        if (monto <= 0) return false;
        Connection conn = Conexion.obtenerConexion();
        try {
            String query = "UPDATE clientes SET saldo = saldo + ? WHERE numero_cuenta = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setDouble(1, monto);
            ps.setString(2, numeroCuenta);
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                saldo += monto;
                registrarTransaccion("depósito", monto);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean realizarRetiro(double monto) {
        if (monto <= 0 || saldo < monto) return false;
        Connection conn = Conexion.obtenerConexion();
        try {
            String query = "UPDATE clientes SET saldo = saldo - ? WHERE numero_cuenta = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setDouble(1, monto);
            ps.setString(2, numeroCuenta);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                saldo -= monto;
                registrarTransaccion("retiro", monto);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
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



	
	public void opcionesCliente() {
		
        Scanner sc = new Scanner(System.in);
		
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
                    System.out.println("Saldo actual: " + this.obtenerSaldo());
                    break;
                case 2:
                    System.out.print("Ingresa el monto a depositar: ");
                    double montoDeposito = sc.nextDouble();
                    if (this.realizarDeposito(montoDeposito)) {
                        System.out.println("Depósito exitoso. Nuevo saldo: " + this.obtenerSaldo());
                    } else {
                        System.out.println("Error al realizar el depósito.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el monto a retirar: ");
                    double montoRetiro = sc.nextDouble();
                    if (this.realizarRetiro(montoRetiro)) {
                        System.out.println("Retiro exitoso. Nuevo saldo: " + this.obtenerSaldo());
                    } else {
                        System.out.println("Error al realizar el retiro.");
                    }
                    break;
                case 4:
                    System.out.print("Ingresa el número de cuenta de destino: ");
                    String cuentaDestino = sc.next();
                    System.out.print("Ingresa el monto a transferir: ");
                    double montoTransferencia = sc.nextDouble();
                    if (this.realizarTransferencia(cuentaDestino, montoTransferencia)) {
                        System.out.println("Transferencia exitosa. Nuevo saldo: " + this.obtenerSaldo());
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