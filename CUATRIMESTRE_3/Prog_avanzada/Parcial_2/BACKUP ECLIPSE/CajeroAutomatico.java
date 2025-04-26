package parcial_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CajeroAutomatico {
	private static int id;
    private static double cantidadDinero;
    

    public CajeroAutomatico(int id, double cantidadDinero) {
        this.id = id;
        this.cantidadDinero = cantidadDinero;
    }

    
    //traerme la info del cajero automatico desde la db
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

    public static int getId() {
    	return id;
    }

	public double getCantidadDinero() {
		System.out.println("Cantidad de plata del cajero:" + cantidadDinero);
        return cantidadDinero;
    }

    public static void setCantidadDinero(double cantidadDinero) {
        CajeroAutomatico.cantidadDinero = cantidadDinero;
    }

    // Método para obtener el saldo del cliente
    public static double obtenerSaldo(Cliente cliente) {
        return cliente.getSaldo();
    }
    
 // Método para realizar un depósito
    public static boolean realizarDeposito(Cliente cliente, double monto) {

        if (monto <= 0) {
            return false; // Si el monto es inválido (menor o igual a 0), retorna false
        }
        
        Connection conn = Conexion.obtenerConexion();
        
        try {
            // Actualizar el saldo del cliente en la base de datos
            String queryCliente = "UPDATE clientes SET saldo = saldo + ? WHERE numero_cuenta = ?";
            
            PreparedStatement psCliente = conn.prepareStatement(queryCliente);
            
            psCliente.setDouble(1, monto);
            psCliente.setString(2, cliente.getNumeroCuenta());
            
            int rowsAffectedCliente = psCliente.executeUpdate();

            if (rowsAffectedCliente > 0) {
                // Actualizo el saldo del cliente en el objeto
                cliente.setSaldo(cliente.getSaldo() + monto);

                // Registrar la transacción del depósito
                registrarTransaccion(cliente.getNumeroCuenta(), "depósito", monto);

                // Obtener la cantidad actual de dinero en el cajero desde la base de datos
                String queryCajero = "SELECT cantidadDinero FROM cajeroAutomatico WHERE id = ?";
                
                PreparedStatement psCajero = conn.prepareStatement(queryCajero);
                
                psCajero.setInt(1, CajeroAutomatico.getId());
                
                ResultSet rsCajero = psCajero.executeQuery();

                if (rsCajero.next()) {
                    double dineroEnCajero = rsCajero.getDouble("cantidadDinero");
                    double nuevaCantidad = dineroEnCajero + monto;

                    // Actualizar la cantidad de dinero en el cajero en la base de datos
                    String queryUpdateCajero = "UPDATE cajeroAutomatico SET cantidadDinero = ? WHERE id = ?";
                    
                    PreparedStatement psUpdateCajero = conn.prepareStatement(queryUpdateCajero);
                    
                    psUpdateCajero.setDouble(1, nuevaCantidad);
                    psUpdateCajero.setInt(2, CajeroAutomatico.getId());

                    int rowsAffectedCajero = psUpdateCajero.executeUpdate();

                    if (rowsAffectedCajero > 0) {
                        // Actualizamos la cantidadDinero en el objeto CajeroAutomatico (si es necesario)
                        CajeroAutomatico.setCantidadDinero(nuevaCantidad);

                        System.out.println("Cantidad en el cajero después del depósito: " + nuevaCantidad);
                       
                        return true; // El depósito fue exitoso
                    } else {
                        System.out.println("Error al actualizar la cantidad de dinero en el cajero.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false; // Si algo salió mal, retorna false
    }

    
    
    // Método para realizar un retiro
    public static boolean realizarRetiro(Cliente cliente, double monto) {
        // Obtener la cantidad de dinero actual en el cajero
        System.out.println("Cantidad en el cajero antes del retiro: " + cantidadDinero); // Ver si cantidadDinero está correctamente inicializada

        if (monto <= 0 || cliente.getSaldo() < monto || cantidadDinero < monto) {
            return false; // Si el monto es inválido o el saldo del cliente o el cajero no es suficiente, retorna false
        }

        Connection conn = Conexion.obtenerConexion();
        
        try {
            // Actualizar el saldo del cliente
            String queryCliente = "UPDATE clientes SET saldo = saldo - ? WHERE numero_cuenta = ?";
            
            PreparedStatement psCliente = conn.prepareStatement(queryCliente);
            
            psCliente.setDouble(1, monto);
            psCliente.setString(2, cliente.getNumeroCuenta());
            
            int rowsAffectedCliente = psCliente.executeUpdate();

            if (rowsAffectedCliente > 0) {
                // Actualizar el saldo del cliente en el objeto
                cliente.setSaldo(cliente.getSaldo() - monto);

                // Registrar la transacción
                registrarTransaccion(cliente.getNumeroCuenta(), "retiro", monto);

                // Ahora, actualizamos la cantidad de dinero en el cajero
                // Obtener la cantidad actual de dinero en el cajero desde la base de datos
                
                String queryCajero = "SELECT cantidadDinero FROM cajeroAutomatico WHERE id = ?";
                
                PreparedStatement psCajero = conn.prepareStatement(queryCajero);
                
                psCajero.setInt(1, CajeroAutomatico.getId());
                
                ResultSet rsCajero = psCajero.executeQuery();

                if (rsCajero.next()) {
                    
                	double cantidadActualCajero = rsCajero.getDouble("cantidadDinero");
                    double nuevaCantidadCajero = cantidadActualCajero - monto;

                    // Actualizar la cantidad de dinero del cajero en la base de datos
                    String queryUpdateCajero = "UPDATE cajeroAutomatico SET cantidadDinero = ? WHERE id = ?";
                    
                    PreparedStatement psUpdateCajero = conn.prepareStatement(queryUpdateCajero);
                    
                    psUpdateCajero.setDouble(1, nuevaCantidadCajero);
                    psUpdateCajero.setInt(2, CajeroAutomatico.getId());

                    int rowsAffectedCajero = psUpdateCajero.executeUpdate();

                    if (rowsAffectedCajero > 0) {
                        // Actualizar la cantidadDinero en el objeto (si es necesario)
                        CajeroAutomatico.setCantidadDinero(nuevaCantidadCajero);
                        
                        System.out.println("Cantidad en el cajero después del retiro: " + nuevaCantidadCajero);
                        return true;
                    } else {
                        System.out.println("Error al actualizar la cantidad de dinero en el cajero.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }

    
    
 // Método para realizar una transferencia
    public static boolean realizarTransferencia(Cliente cliente, String cuentaDestino, double monto) {

        if (monto <= 0 || cliente.getSaldo() < monto) {
        	return false;
        }
        Connection conn = Conexion.obtenerConexion();
        try {
            conn.setAutoCommit(false); // Inicia transacción

            // Actualizar saldo del cliente actual
            String query1 = "UPDATE clientes SET saldo = saldo - ? WHERE numero_cuenta = ?";
            
            PreparedStatement ps1 = conn.prepareStatement(query1);
            
            ps1.setDouble(1, monto);
            ps1.setString(2, cliente.getNumeroCuenta());
            
            int rowsAffected1 = ps1.executeUpdate();

            // Actualizar saldo de la cuenta destino
            
            String query2 = "UPDATE clientes SET saldo = saldo + ? WHERE numero_cuenta = ?";
            
            PreparedStatement ps2 = conn.prepareStatement(query2);
            
            ps2.setDouble(1, monto);
            ps2.setString(2, cuentaDestino);
            
            int rowsAffected2 = ps2.executeUpdate();

            if (rowsAffected1 > 0 && rowsAffected2 > 0) {
                conn.commit(); // Se usa para evitar inconsistencias
            
                cliente.setSaldo(cliente.getSaldo() - monto); // Actualiza el saldo del cliente
                
                registrarTransaccion(cliente.getNumeroCuenta(), "transferencia", monto);
                
                return true;
            } else {
                conn.rollback(); // Revierte la transacción si algo falla
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    private static void registrarTransaccion(String numeroCuenta, String tipo, double monto) {
        
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
}
