package CUATRIMESTRE_2.POO.Semana_12;

public class CuentaBancaria {
    private double saldo;
    private String nombre;
    private String nroCuenta;


    public CuentaBancaria(){
        this.saldo = 0;
        this.nombre = "Desconocido";
        this.nroCuenta = "0000000";
    }

    public CuentaBancaria(double saldoInicial, String nombre, String nroCuenta) {
        this.saldo = saldoInicial;
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
    }

    public void depositar(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("Se ha depositado " + cantidad + " en su cuenta.");
        } else {
            System.out.println("No se puede depositar una cantidad negativa.");
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " de su cuenta.");
        } else {
            System.out.println("No se puede retirar esa cantidad o el saldo es insuficiente.");
        }
    }

    public double consultar(){
        return saldo;
    }



    // Métodos getters y setters para el nombre del titular y el número de
	// cuenta
	public String getNombreTitular() {
		return nombre;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return nroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.nroCuenta = nroCuenta;
	}
}
