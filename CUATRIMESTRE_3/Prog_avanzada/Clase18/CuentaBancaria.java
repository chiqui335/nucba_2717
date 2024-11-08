package CUATRIMESTRE_3.Prog_avanzada.Clase18;

public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public synchronized boolean realizarRetiro(double cantidad){ //metodo para controlar el acceso de la concurrencia de varios hilos a varios recursos SOLO UN HILO PUEDE ACCEDER AL METODO/RECURSO, LOS OTROS TIENEN QUE ESPERAR
        if (saldo >= cantidad) {
            System.out.println(Thread.currentThread().getName() + " esta procesando un retro de $" + cantidad);
            try {
                Thread.sleep(1000); // simulacion de espera
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saldo -= cantidad;
            System.out.println("retiro exitoso de $" + cantidad + " Nuevo saldo: "+ saldo);
            return true;
        } else {
            System.out.println("no tiene fondos suficientes");
            return false;
        }
    }
}
