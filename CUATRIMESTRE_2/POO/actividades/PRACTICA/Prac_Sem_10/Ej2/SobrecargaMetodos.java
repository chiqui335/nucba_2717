package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_10.Ej2;

public class SobrecargaMetodos {
    private int resultadoEntero;
    private double resultadoDouble;

    // Método para multiplicar dos enteros
    public int multiplicar(int a, int b) {
        resultadoEntero = a * b;
        return resultadoEntero;
    }

    // Método para multiplicar dos dobles
    public double multiplicar(double a, double b) {
        resultadoDouble = a * b;
        return resultadoDouble;
    }

    // Método para multiplicar tres enteros
    public int multiplicar(int a, int b, int c) {
        resultadoEntero = a * b * c;
        return resultadoEntero;
    }

    // Sobreescritura del método toString()
    @Override
    public String toString() {
        return "SobrecargaMetodos{" +
                "resultadoEntero=" + resultadoEntero +
                ", resultadoDouble=" + resultadoDouble +
                '}';
    }

    public static void main(String[] args) {
        SobrecargaMetodos sm = new SobrecargaMetodos();
        System.out.println("El resultado de multiplicar 3 y 4 es: " + sm.multiplicar(3, 4));
        System.out.println("El resultado de multiplicar 3.0 y 4.0 es: " + sm.multiplicar(3.0, 4.0));
        System.out.println("El resultado de multiplicar 3, 4 y 5 es: " + sm.multiplicar(3, 4, 5));
        System.out.println(sm.toString());
    }
}
