package CUATRIMESTRE_2.POO.actividades.cuentas;

import java.util.Scanner;

public class Cuenta {
    Scanner sc = new Scanner(System.in);
    private double saldo;
    // private int id;

    public void setSaldo(double saldo) {
        if (this.saldo > 0.0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
            this.saldo = saldo;
        }

        // this.saldo = (this.saldo > 0.0) ? saldo : 0.0; ---> la forma ternaria de
        // ponerlo?
    }

    public void abonar() {
        double montoAbonado = -1;

        while (montoAbonado < 0.0) {
            System.out.println("Ingrese monto a abonar: ");
            montoAbonado = sc.nextDouble();

            if (montoAbonado < 0.0) {
                System.out.println("El monto abonado debe ser mayor o igual que cero.");
            }
        }

        saldo = saldo + montoAbonado;
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
