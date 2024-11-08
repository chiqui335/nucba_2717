package CUATRIMESTRE_3.Prog_avanzada.Clase18;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("1234", 10000);

        Thread cajero1 = new Thread(new Cajero(cuenta, 2000), "cajero1");
        Thread cajero2 = new Thread(new Cajero(cuenta, 4000), "cajero2");
        Thread cajero3 = new Thread(new Cajero(cuenta, 3000), "cajero3");

        System.out.println("Salgo inicial: $" + cuenta.getSaldo());
        
        cajero1.start();
        cajero2.start();
        cajero3.start();

        try {
            cajero1.join();
            cajero2.join();
            cajero3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("todas las operaciones completadas");
        System.out.println("Saldo final: $"+ cuenta.getSaldo());

        ////////////////////////////////////////////////////
        
        System.out.println("OTRO EJEMPLOOO");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
