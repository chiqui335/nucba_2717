package parcial_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USUARIO = "root";  // Cambia esto según tu configuración
    private static final String CONTRASENA = "";  // Cambia esto según tu configuración

    public static Connection obtenerConexion() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

