package CUATRIMESTRE_2.POO.Semana_12;

public class CuentaBancariaTest {
    public static void main(String[] args){
        CuentaBancaria cb1 = new CuentaBancaria(2000.0, "Marcos", "123456789");
        CuentaBancaria cb2 = new CuentaBancaria(5000.0, "Juan Pérez","12345678");

        //mostrar saldo 
        System.out.println("Saldo de la cuenta 1: " + cb1.consultar());
        System.out.println("Saldo de la cuenta 2: " + cb2.consultar());

        //retirar dinero
        cb1.retirar(500.0);
        cb2.retirar(700.0);

        //depositar dinero
        cb1.depositar(200.0);
        cb2.depositar(300.0);

        //saldo final?
        System.out.println("Saldo final de la cuenta 1: " + cb1.consultar());
        System.out.println("Saldo final de la cuenta 2: " + cb2.consultar());
    }
}
