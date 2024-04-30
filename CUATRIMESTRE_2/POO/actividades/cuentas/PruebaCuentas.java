package CUATRIMESTRE_2.POO.actividades.cuentas;

public class PruebaCuentas {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();

        c1.setSaldo(200.0);

        c1.abonar();

        c1.obtenerSaldo();

        System.out.println(c1.obtenerSaldo());

    }
}
