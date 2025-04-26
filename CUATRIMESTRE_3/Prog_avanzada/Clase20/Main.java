package CUATRIMESTRE_3.Prog_avanzada.Clase20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//FUE SEGUIR ESTA ESTRUCTURA PARA EL PARCIAL
//REVER CLASE 11/11 CONTINUA EN LA HORA 1:00:00 

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        try (Connection conexion = (Connection) DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
            System.out.println("conexion exitosa");

            //crear tabla
            crearTabla(conexion);
            //insertar usuarios
            insertarUsuario(conexion, "carlos", "carlos@gmail.com", 30);
            //consultar usuarios
            consultarUsuarios(conexion);
            //actualizar usuario
            actualizarUsuario(conexion, 1, "carlos garcia", "carlos.garcia@gmail.com", 31);
            //eliminar usuario

        } catch (SQLException e){
            e.printStackTrace();
        } 
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
     }
    }

    private static void crearTabla (Connection conexion) throws SQLException{
        String sql = """
                CREATE TABLE IF NOT EXISTS usuarios (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    NOMBRE VARCHAR(255) NOT NULL,
                    email VARCHAR(255) UNIQUE NOT NULL,
                    edad INT 
                );
                """;   
        
        try (Statement stmt = (Statement) conexion.createStatement()){
            stmt.execute(sql);
            System.out.println("Tabla usuarios creada");
        }
    }

    private static void insertarUsuario(Connection conexion, String nombre, String email, int edad) throws SQLException{
        String sql = "INSERT INTO usuarios (nombre, email, edad) VALUES (?,?,?)";

    try (PreparedStatement pstmt = (PreparedStatement) conexion.prepareStatement(sql)){
        pstmt.setString(1, nombre);
        pstmt.setString(2, email);
        pstmt.setInt(3, edad);
        pstmt.executeUpdate();

        System.out.println("usuario se agrego");
        }
    }

    private static void consultarUsuarios (Connection conexion) throws SQLException {
        String sql = "SELECT * FROM usuarios";

        try (Statement stmt = (Statement) conexion.createStatement() ;
            ResultSet rs = stmt.executeQuery(sql)) {
                 System.out.println("listado de usuarios");
                 while (rs.next()){ 
                    System.out.printf("ID: %d, Nombre : %s, Email : %s, Edad: %d%n", 
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("email"),
                    rs.getInt("edades")
                    );
                 }
            }
        }

        private static void actualizarUsuario(Connection conexion, int id, String nombre, String email, int edad) throws SQLException {
            String sql = "UPDATE usuarios SET nombre = ?, email = ?, edad = ? WHERE id = ?";

            try (PreparedStatement pstmt = (PreparedStatement) conexion.prepareStatement(sql)){
                pstmt.setString(1, nombre);
                pstmt.setString(2, email);
                pstmt.setInt(3, edad);
                pstmt.setInt(4, id);

                int filasAfectadas = pstmt.executeUpdate();
                System.out.println("actualizado, filas afectadas: " + filasAfectadas);
            }
        }

        private static void eliminarUsuario(Connection conexion, int id) throws SQLException {
            String sql = "DELETE FROM usuarios WHERE id =?";

            try (PreparedStatement pstmt = (PreparedStatement) conexion.prepareStatement(sql)){
                pstmt.setInt(1, id);

                int filasAfectadas = pstmt.executeUpdate();
                System.out.println("actualizado, filas afectadas: " + filasAfectadas);
            }
        }
}

//CONTINUA EN LA HORA 1:00:00