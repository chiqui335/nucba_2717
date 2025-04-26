package parcial_2;

import java.sql.*;
import java.util.Scanner;

public class Empleado {
	
    public void verTransacciones() {
        Connection conn = Conexion.obtenerConexion();
        try {
            String query = "SELECT * FROM transacciones";
            
            Statement stmt = conn.createStatement();
           
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                System.out.println("Cuenta: " + rs.getString("numero_cuenta") +
                        " Tipo: " + rs.getString("tipo") +
                        " Monto: " + rs.getDouble("monto") +
                        " Fecha: " + rs.getTimestamp("fecha"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    

    public static void reponerDinero() {
        Scanner sc = new Scanner(System.in);
        
        // Definir el monto  para la reposición
        System.out.print("Ingresa la cantidad de dinero a reponer: ");
        double monto = sc.nextDouble();

        // Obtener la conexión a la base de datos
        Connection conn = Conexion.obtenerConexion();
        
        try {
            // Crear la consulta SQL para actualizar la cantidad de dinero
            String query = "SELECT cantidadDinero FROM cajeroAutomatico WHERE id = ?";

            // Preparar la sentencia
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, CajeroAutomatico.getId());

            ResultSet rs = ps.executeQuery();
                        
            if(rs.next()) {
            	// Obtener la cantidad de dinero actual
                double dineroEnCajero = rs.getDouble("cantidadDinero");
                
                double nuevaCantidad = dineroEnCajero + monto;

                String queryUpdate = "UPDATE cajeroAutomatico SET cantidadDinero = ? WHERE id = ?";
                
                PreparedStatement psUp = conn.prepareStatement(queryUpdate);
                
                psUp.setDouble(1, nuevaCantidad);
                psUp.setInt(2, CajeroAutomatico.getId());
                
                int rowsAffected = psUp.executeUpdate();
                
                if (rowsAffected > 0) {
                    // Actualizar la cantidad de dinero en el objeto también
                    CajeroAutomatico.setCantidadDinero(monto);
                    
                    System.out.println("El cajero ha sido reabastecido con $" + monto);
                } else {
                    System.out.println("No se encontró el cajero con ID: " + CajeroAutomatico.getId());
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
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


}

