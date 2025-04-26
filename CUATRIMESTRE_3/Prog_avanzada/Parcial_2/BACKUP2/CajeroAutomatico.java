package parcial2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CajeroAutomatico {
    private int id;  
    private double cantidadDinero;  

    // Constructores
    public CajeroAutomatico(int id, double cantidadDinero) {
        this.id = id;
        this.cantidadDinero = cantidadDinero;
    }

    // Traerme la info del cajero automático desde la DB
    public static CajeroAutomatico obtenerCajeroAutomatico(int id) {
        Connection conn = Conexion.obtenerConexion();
        CajeroAutomatico cajero = null;

        try {
            String query = "SELECT cantidadDinero FROM cajeroAutomatico WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Aquí puedes agregar la lógica para obtener los datos del cajero si es necesario
                // Por ejemplo, puedes obtener la cantidad de dinero en el cajero
                double cantidadDinero = rs.getDouble("cantidadDinero");
                
                // Ahora instanciamos el cajero con los datos necesarios
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


    // Métodos de acceso
    public int getId() {
        return id;
    }

    public double getCantidadDinero() {
        System.out.println("Cantidad de plata del cajero:" + cantidadDinero);
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    // Método para obtener el saldo del cliente
    public double obtenerSaldo(Cliente cliente) {
        return cliente.getSaldo();
    }
    
    // Método para realizar un depósito
    public boolean realizarDeposito(Cliente cliente, double monto) {

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
                registrarTransaccion(cliente.getNumeroCuenta(), null, "depósito", monto);

                // Obtener la cantidad actual de dinero en el cajero desde la base de datos
                String queryCajero = "SELECT cantidadDinero FROM cajeroAutomatico WHERE id = ?";
                
                PreparedStatement psCajero = conn.prepareStatement(queryCajero);
                
                psCajero.setInt(1, this.id);  // Utilizo 'this.id' porque ya no es estático
                
                ResultSet rsCajero = psCajero.executeQuery();

                if (rsCajero.next()) {
                    double dineroEnCajero = rsCajero.getDouble("cantidadDinero");
                    double nuevaCantidad = dineroEnCajero + monto;

                    // Actualizar la cantidad de dinero en el cajero en la base de datos
                    String queryUpdateCajero = "UPDATE cajeroAutomatico SET cantidadDinero = ? WHERE id = ?";
                    
                    PreparedStatement psUpdateCajero = conn.prepareStatement(queryUpdateCajero);
                    
                    psUpdateCajero.setDouble(1, nuevaCantidad);
                    psUpdateCajero.setInt(2, this.id);  // Utilizo 'this.id' aquí también

                    int rowsAffectedCajero = psUpdateCajero.executeUpdate();

                    if (rowsAffectedCajero > 0) {
                        // Actualizamos la cantidadDinero en el objeto CajeroAutomatico (si es necesario)
                        this.setCantidadDinero(nuevaCantidad);

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
    public boolean realizarRetiro(Cliente cliente, double monto) {
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
                registrarTransaccion(cliente.getNumeroCuenta(), null, "retiro", monto);

                // Ahora, actualizamos la cantidad de dinero en el cajero
                // Obtener la cantidad actual de dinero en el cajero desde la base de datos
                
                String queryCajero = "SELECT cantidadDinero FROM cajeroAutomatico WHERE id = ?";
                
                PreparedStatement psCajero = conn.prepareStatement(queryCajero);
                
                psCajero.setInt(1, this.id);  // Utilizo 'this.id'
                
                ResultSet rsCajero = psCajero.executeQuery();

                if (rsCajero.next()) {
                    
                    double cantidadActualCajero = rsCajero.getDouble("cantidadDinero");
                    double nuevaCantidadCajero = cantidadActualCajero - monto;

                    // Actualizar la cantidad de dinero del cajero en la base de datos
                    String queryUpdateCajero = "UPDATE cajeroAutomatico SET cantidadDinero = ? WHERE id = ?";
                    
                    PreparedStatement psUpdateCajero = conn.prepareStatement(queryUpdateCajero);
                    
                    psUpdateCajero.setDouble(1, nuevaCantidadCajero);
                    psUpdateCajero.setInt(2, this.id);  // Utilizo 'this.id'

                    int rowsAffectedCajero = psUpdateCajero.executeUpdate();

                    if (rowsAffectedCajero > 0) {
                        // Actualizar la cantidadDinero en el objeto (si es necesario)
                        this.setCantidadDinero(nuevaCantidadCajero);
                        
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
    public boolean realizarTransferencia(Cliente cliente, String cuentaDestino, double monto) {

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

                // Registrar la transacción (cuenta origen y cuenta destino)
                registrarTransaccion(cliente.getNumeroCuenta(), cuentaDestino, "transferencia", monto);

                return true;
            } else {
                conn.rollback(); // Revierte la transacción si algo sale mal
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }

    // Método auxiliar para registrar transacciones
    private void registrarTransaccion(String cuentaOrigen, String cuentaDestino, String tipo, double monto) {
        Connection conn = Conexion.obtenerConexion();
        
        try {
            // Ahora la transacción incluye tanto la cuenta origen como la cuenta destino
            String query = "INSERT INTO transacciones (numero_cuenta, cuenta_destino, tipo, monto) VALUES (?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, cuentaOrigen);   
            ps.setString(2, cuentaDestino);  
            ps.setString(3, tipo);           
            ps.setDouble(4, monto);          
            
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
