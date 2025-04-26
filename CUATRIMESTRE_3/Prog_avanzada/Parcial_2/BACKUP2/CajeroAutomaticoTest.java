package CUATRIMESTRE_3.Prog_avanzada.Parcial_2.BACKUP2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CajeroAutomaticoTest {

    


    public static CajeroAutomatico obtenerCajeroAutomatico(int id) {
        Connection conn = Conexion.obtenerConexion();
        CajeroAutomatico cajero = null;

        try {
            String query = "SELECT cantidadDinero FROM cajeroAutomatico WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double cantidadDinero = rs.getDouble("cantidadDinero");
                
                // Instancia del cajero
                cajero = new CajeroAutomatico(id, cantidadDinero);
            } else {
                System.out.println("No se encontró un cajero automático con el id: " + id);
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

        return cajero;
    }


    public static void insertarCajeroSiNoExiste() {
        // Conectar a la base de datos
        try (Connection conn = Conexion.obtenerConexion();) {
            
            // Verificar si ya existe un registro en la tabla cajeroautomatico
            String checkQuery = "SELECT COUNT(*) FROM cajeroautomatico";
            try (PreparedStatement stmt = conn.prepareStatement(checkQuery);
                 ResultSet rs = stmt.executeQuery()) {
                
                if (rs.next() && rs.getInt(1) == 0) {  // Si no hay registros (COUNT = 0)
                    // No hay registros, hacer el insert
                    String insertQuery = "INSERT INTO cajeroautomatico (cantidadDinero) VALUES (?)";
                    try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
                        insertStmt.setDouble(1, 50000.00);  // Monto inicial
                        int filasAfectadas = insertStmt.executeUpdate();
                        
                        if (filasAfectadas > 0) {
                            System.out.println("Cajero insertado exitosamente.");
                        } else {
                            System.out.println("No se pudo insertar el cajero.");
                        }
                    }
                } else {
                    System.out.println("Ya existe un cajero en la base de datos.");
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


        public boolean realizarTransferencia(String cuentaDestino, double monto) {
        if (monto <= 0 || saldo < monto) return false;
        
        Connection conn = Conexion.obtenerConexion();
        
        try {
            // Actualizo saldo del cliente actual
            String query1 = "UPDATE clientes SET saldo = saldo - ? WHERE numero_cuenta = ?";
            
            PreparedStatement ps1 = conn.prepareStatement(query1);
            
            ps1.setDouble(1, monto);
            ps1.setString(2, numeroCuenta);
            
            int rowsAffected1 = ps1.executeUpdate();

            // Actualizo saldo de la cuenta destino
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



    package pruebasCajeroBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_DB_Para_Tests {
    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USUARIO = "root";  
    private static final String CONTRASENA = "";  

    public static Connection obtenerConexion() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}




package pruebasCajeroBanco;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cajeroBanco.CajeroAutomatico;
import cajeroBanco.Cliente;
import cajeroBanco.Conexion;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.*;

public class CajeroAutomaticoTest {

    private Connection conn;
    private boolean rollback = false; // Esta variable nos ayudará a controlar si hacemos rollback o commit

    @BeforeEach
    public void setup() throws SQLException {
        // Establece la conexión a la base de datos de prueba
        conn = Conexion.obtenerConexion();
        conn.setAutoCommit(false);  // Desactivamos el auto-commit para poder controlar la transacción manualmente
    }

    @AfterEach
    public void teardown() throws SQLException {
        if (rollback) {
            // Si la variable rollback es true, revertimos todos los cambios
            conn.rollback();
        } else {
            // Si no hubo errores, confirmamos los cambios (esto es opcional, ya que rollback es nuestra prioridad)
            conn.commit();
        }
        conn.close(); // Cerramos la conexión después de cada test
    }

    private CajeroAutomatico obtenerCajeroPorId(int id) throws SQLException {
        String sql = "SELECT * FROM CajeroAutomatico WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    double cantidadDinero = rs.getDouble("cantidadDinero");
                    return new CajeroAutomatico(id, cantidadDinero);
                }
            }
        }
        return null; // Si no se encuentra el cajero con ese ID
    }

    @Test
    public void testRealizarDeposito() throws SQLException {
        rollback = true; // Indicamos que debemos hacer rollback si ocurre algún error

        // Usar los clientes de prueba ya insertados en la base de datos
        Cliente cliente = new Cliente("ClienteTest1", "123"); // ClienteTest1 con saldo de 10000.00
        CajeroAutomatico cajero = obtenerCajeroPorId(999); // Obtener el cajero con ID 999

        // Realizar un depósito
        boolean resultado = cajero.realizarDeposito(cliente, 500.00);

        // Verificar si el depósito fue exitoso
        assertTrue(resultado);

        // Verificar si el saldo del cliente y el cajero se actualizaron correctamente
        assertEquals(10500.00, cliente.getSaldo());  // Saldo del cliente debe ser 10500.00
        assertEquals(104999.00, cajero.getCantidadDinero());  // Saldo del cajero debe ser 104999.00 (99999 + 500)
    }

    @Test
    public void testRealizarRetiro() throws SQLException {
        rollback = true; // Indicamos que debemos hacer rollback si ocurre algún error

        // Usar los clientes de prueba ya insertados en la base de datos
        Cliente cliente = new Cliente("ClienteTest1", "123"); // ClienteTest1 con saldo de 10000.00
        CajeroAutomatico cajero = obtenerCajeroPorId(999); // Obtener el cajero con ID 999

        // Realizar un retiro
        boolean resultado = cajero.realizarRetiro(cliente, 200.00);

        // Verificar si el retiro fue exitoso
        assertTrue(resultado);

        // Verificar si el saldo del cliente y el cajero se actualizaron correctamente
        assertEquals(9800.00, cliente.getSaldo());  // Saldo del cliente debe ser 9800.00
        assertEquals(104799.00, cajero.getCantidadDinero());  // Saldo del cajero debe ser 104799.00 (99999 - 200)
    }

    @Test
    public void testRealizarTransferencia() throws SQLException {
        rollback = true; // Indicamos que debemos hacer rollback si ocurre algún error

        // Usar los clientes de prueba ya insertados en la base de datos
        Cliente clienteOrigen = new Cliente("ClienteTest1", "123");  // ClienteTest1
        Cliente clienteDestino = new Cliente("ClienteTest2", "123");  // ClienteTest2
        CajeroAutomatico cajero = obtenerCajeroPorId(999); // Obtener el cajero con ID 999

        // Realizar una transferencia
        boolean resultado = cajero.realizarTransferencia(clienteOrigen, "ClienteTest2", 300.00);

        // Verificar si la transferencia fue exitosa
        assertTrue(resultado);

        // Verificar si los saldos de ambos clientes se actualizaron correctamente
        assertEquals(9700.00, clienteOrigen.getSaldo());  // Saldo del clienteOrigen debe ser 9700.00
        assertEquals(10300.00, clienteDestino.getSaldo());  // Saldo del clienteDestino debe ser 10300.00
    }

    @Test
    public void testRealizarDepositoMontoInvalido() throws SQLException {
        rollback = true; // Indicamos que debemos hacer rollback si ocurre algún error

        // Usar el cliente de prueba ya insertado
        Cliente cliente = new Cliente("ClienteTest1", "123"); // ClienteTest1 con saldo de 10000.00
        CajeroAutomatico cajero = obtenerCajeroPorId(999); // Obtener el cajero con ID 999

        // Intentar realizar un depósito con monto inválido
        boolean resultado = cajero.realizarDeposito(cliente, -500.00);

        // Verificar que el depósito no fue realizado
        assertFalse(resultado);
    }

    @Test
    public void testRealizarRetiroMontoInsuficiente() throws SQLException {
        rollback = true; // Indicamos que debemos hacer rollback si ocurre algún error

        // Usar el cliente de prueba ya insertado
        Cliente cliente = new Cliente("ClienteTest1", "123"); // ClienteTest1 con saldo de 10000.00
        CajeroAutomatico cajero = obtenerCajeroPorId(999); // Obtener el cajero con ID 999

        // Intentar realizar un retiro con saldo insuficiente en el cliente
        boolean resultado = cajero.realizarRetiro(cliente, 20000.00);

        // Verificar que el retiro no fue realizado
        assertFalse(resultado);
    }

    @Test
    public void testRealizarTransferenciaMontoInvalido() throws SQLException {
        rollback = true; // Indicamos que debemos hacer rollback si ocurre algún error

        // Usar el cliente de prueba ya insertado
        Cliente clienteOrigen = new Cliente("ClienteTest1", "123"); // ClienteTest1
        CajeroAutomatico cajero = obtenerCajeroPorId(999); // Obtener el cajero con ID 999

        // Intentar realizar una transferencia con monto inválido
        boolean resultado = cajero.realizarTransferencia(clienteOrigen, "ClienteTest2", -100.00);

        // Verificar que la transferencia no fue realizada
        assertFalse(resultado);
    }
}




}
