package CUATRIMESTRE_3.Prog_avanzada.Clase18;

public class Cajero implements Runnable {
    private CuentaBancaria cuenta;
    private double cantidadRetiro;

    public Cajero(CuentaBancaria cuenta, double cantidadRetiro) {
        this.cuenta = cuenta;
        this.cantidadRetiro = cantidadRetiro;
    }

    @Override
    public void run() {
        cuenta.realizarRetiro(cantidadRetiro);
    }
}
