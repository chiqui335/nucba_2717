package CUATRIMESTRE_3.Prog_avanzada.Parcial_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CajeroAutomatico {
	private int id;
    private double cantidadDinero;
    
    private Cliente cliente;
    
    public CajeroAutomatico(Cliente cliente) {
    	this.cliente = cliente;
    }

    public CajeroAutomatico(int id, double cantidadDinero) {
        this.id = id;
        this.cantidadDinero = cantidadDinero;
    }



	public double getCantidadDinero() {
		System.out.println("Cantodad de plata del cajero:" + cantidadDinero);
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
        	return false;
        }
        
        Connection conn = Conexion.obtenerConexion();
        
        try {
            String query = "UPDATE clientes SET saldo = saldo + ? WHERE numero_cuenta = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setDouble(1, monto);
            ps.setString(2, cliente.getNumeroCuenta());
            
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                cliente.setSaldo(cliente.getSaldo() + monto); // Actualiza el saldo del cliente
            
                registrarTransaccion(cliente.getNumeroCuenta(), "depósito", monto);
                
                this.cantidadDinero += monto; // Actualiza el monto del cajero
                
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    // Método para realizar un retiro
    public boolean realizarRetiro(Cliente cliente, double monto) {
    	System.out.println("Cantidad en el cajero antes del retiro: " + this.cantidadDinero); //DA FUCK?

        if (monto <= 0 || cliente.getSaldo() < monto || this.cantidadDinero < monto) {
        	 return false;
        }
    
        Connection conn = Conexion.obtenerConexion();
        
        try {
            String query = "UPDATE clientes SET saldo = saldo - ? WHERE numero_cuenta = ?";
    
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setDouble(1, monto);
            ps.setString(2, cliente.getNumeroCuenta());
            
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                cliente.setSaldo(cliente.getSaldo() - monto); // Actualiza el saldo del cliente
            
                registrarTransaccion(cliente.getNumeroCuenta(), "retiro", monto);
                
                this.cantidadDinero -= monto; // Actualiza el monto del cajero
                
                System.out.println("Cantidad en el cajero después del retiro: " + this.cantidadDinero); //DA FUCK?

                return true;
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
    
    
    private void registrarTransaccion(String numeroCuenta, String tipo, double monto) {
        
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

