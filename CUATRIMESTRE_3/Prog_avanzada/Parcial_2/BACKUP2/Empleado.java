package parcial2;

import java.sql.*;
import java.util.Scanner;

public class Empleado {
	private String nombre;
    private String contraseña;
    private String numeroEmpleado;

    public Empleado(String numeroEmpleado, String contraseña) {
    	this.contraseña = contraseña;
    	this.numeroEmpleado = numeroEmpleado;	
    }

	// Método para ver transacciones de clientes
    public void verTransacciones() {
        Connection conn = Conexion.obtenerConexion();
        try {
            String query = "SELECT * FROM transacciones";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Cuenta: " + rs.getString("numero_cuenta") +
                		" cuenta destino " + rs.getString("cuenta_destino") +
                        " Tipo: " + rs.getString("tipo") +
                        " Monto: " + rs.getDouble("monto") +
                        " Fecha: " + rs.getTimestamp("fecha"));
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

    // Método para reponer dinero en el cajero automático
    public void reponerDinero(CajeroAutomatico cajero) {
        Scanner sc = new Scanner(System.in);

        // Definir el monto para la reposición
        System.out.print("Ingresa la cantidad de dinero a reponer: ");
        double monto = sc.nextDouble();

        // Obtener la conexión a la base de datos
        Connection conn = Conexion.obtenerConexion();

        try {
            // Crear la consulta SQL para obtener el dinero actual en el cajero
            String query = "SELECT cantidadDinero FROM cajeroAutomatico WHERE id = ?";

            // Preparar la sentencia
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, cajero.getId()); // Usamos el id de la instancia pasada como parámetro

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Obtener la cantidad de dinero actual
                double dineroEnCajero = rs.getDouble("cantidadDinero");

                double nuevaCantidad = dineroEnCajero + monto;

                String queryUpdate = "UPDATE cajeroAutomatico SET cantidadDinero = ? WHERE id = ?";

                PreparedStatement psUp = conn.prepareStatement(queryUpdate);
                psUp.setDouble(1, nuevaCantidad);
                psUp.setInt(2, cajero.getId()); // Usamos el id de la instancia pasada como parámetro

                int rowsAffected = psUp.executeUpdate();

                if (rowsAffected > 0) {
                    // Actualizar la cantidad de dinero en el objeto también
                    cajero.setCantidadDinero(nuevaCantidad); // Actualizamos el objeto con la nueva cantidad

                    System.out.println("El cajero ha sido reabastecido con $" + monto);
                } else {
                    System.out.println("No se encontró el cajero con ID: " + cajero.getId());
                }
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


    // Método para registrar un nuevo empleado
    public static boolean registrarEmpleado() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contraseña = sc.nextLine();

        // Obtener la conexión a la base de datos
        Connection conn = Conexion.obtenerConexion();

        if (conn == null) {
            System.out.println("Error al conectar con la base de datos.");
            return false;
        }

        try {
            // Consulta SQL para insertar un nuevo empleado en la tabla 'empleados'
            String query = "INSERT INTO empleados (nombre, usuario, contraseña) VALUES (?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, usuario);
            ps.setString(3, contraseña);

            // Ejecutamos la inserción en la base de datos
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Empleado registrado exitosamente.");
                return true;
            } else {
                System.out.println("Error al registrar al empleado.");
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
    
    
    public static Empleado iniciarSesion() {
        Scanner sc = new Scanner(System.in);

        // Solicitar número de empleado y contraseña
        System.out.print("Ingresa tu usuario: ");
        String usuarioEmpleado = sc.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contraseña = sc.nextLine();

        Connection conn = Conexion.obtenerConexion();
        
        try {
            String query = "SELECT nombre FROM empleados WHERE usuario = ? AND contraseña = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, usuarioEmpleado);
            ps.setString(2, contraseña);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // Crear un objeto Empleado con los datos obtenidos de la base de datos
                Empleado empleado = new Empleado(usuarioEmpleado, contraseña);
                empleado.setNombre(rs.getString("nombre"));
                
                
                return empleado;
            } else {
                System.out.println("Número de empleado o contraseña incorrectos.");
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
        return null;
    }

	private void setNombre(String string) {
		this.nombre = nombre;
	}

	
	public void opcionesEmpleado(Empleado empleado, CajeroAutomatico cajero) {
        Scanner sc = new Scanner(System.in);

        if (empleado == null) {
            System.out.println("No se pudo iniciar sesión. Saliendo...");
            return;
        }
		while(true) {
			System.out.println("Seleccione una opción:");
            System.out.println("1. Ver transacciones");
            System.out.println("2. Reponer dinero en el cajero");
            
            int opcion = sc.nextInt();
            
            switch (opcion) {
            case 1:
                empleado.verTransacciones();
                break;
            
            case 2:
            	empleado.reponerDinero(cajero);
            	break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
        }

		}
	}
    
}

