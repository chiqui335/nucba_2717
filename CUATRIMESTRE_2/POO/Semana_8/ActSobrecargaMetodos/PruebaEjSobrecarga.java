package CUATRIMESTRE_2.POO.actividades.ActSobrecargaMetodos;

public class PruebaEjSobrecarga {
    public static void main(String[] args) {

        EjercicioSobrecarga sum = new EjercicioSobrecarga();
        System.out.println("los resultados en orden son: " + "\nOperacion b: " +
                +sum.sumar(3, 12.8) + "\nOperacion a: " +
                +sum.sumar(3, 5) + "\nOperacion d: " +
                +sum.sumar(4.7f, 6) + "\nOperacion e: " +
                +sum.sumar(5.5, 80) + "\nOperacion b: " +
                +sum.sumar(3.14f, 2.82f));
    }
}
