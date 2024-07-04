package CUATRIMESTRE_2.POO.Semana_10.act;

public class Aritmetica {
    private int numA;// variables de instancia (OBJETO)
    private int numB;
    private int resultado;

    public int sumar(int a, int b) {// variables locales al método
        numA = a;
        numB = b;

        resultado = numA + numB;
        return resultado;
    }

    // sobreescritura con 3 datos
    public int sumar(int a, int b, int c) {
        numA = a;
        numB = b;
        resultado = a + b + c;
        return resultado;
    }

    // sobreescritura con double
    public double sumar(double numA, double numB) {
        return numA + numB;
    }

    public int restar(int a, int b) {// variables locales al método
        numA = a;
        numB = b;

        resultado = numA - numB;
        return resultado;
    }

    // sobreescritura con
    public double restar(double a, double b) {
        double numA = a;
        double numB = b;

        return numB - numA;
    }

    public String toString() {
        return "Aritmetica{" +
                "numA=" + numA +
                ", numB=" + numB +
                ", resultado=" + resultado +
                '}';
    }
}