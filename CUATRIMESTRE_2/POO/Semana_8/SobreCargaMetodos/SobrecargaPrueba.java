package CUATRIMESTRE_2.POO.Semana_8.SobreCargaMetodos;

public class SobrecargaPrueba {
    public static void main(String[] args) {
        Sobrecarga sm = new Sobrecarga();

        System.out.println("3 * 4 es: " + sm.multiplicar(3, 4));
        System.out.println("3.14 * 4.00 es: " + sm.multiplicar(3.14, 4.00));
        System.out.println("2 * 5 * 6 es: " + sm.multiplicar(2, 5, 6));

    }
}
