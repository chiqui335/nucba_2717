package CUATRIMESTRE_3.Prog_avanzada.Parcial_2;

import java.sql.*;

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

    public void reponerDinero(double monto) {
        // Reponer dinero en el cajero (aquí se simula con una actualización de saldo)
        // Podrías almacenar el saldo del cajero en una tabla si lo deseas
        System.out.println("Cajero repondo con: " + monto);
    }
}
