package CUATRIMESTRE_2.POO.actividades.ActSobrecargaMetodos;

public class PruebaEjSobrecarga {
    public static void main(String[] args) {

        EjercicioSobrecarga sum = new EjercicioSobrecarga();
        System.out.println("los resultados en orden son: " + "\n" +
                +sum.sumar(3, 12.8) + "\n" +
                +sum.sumar(3, 5) + "\n" +
                +sum.sumar(4.7f, 6) + "\n" +
                +sum.sumar(5.5, 80) + "\n" +
                +sum.sumar(3.14f, 2.82f));
    }
}
