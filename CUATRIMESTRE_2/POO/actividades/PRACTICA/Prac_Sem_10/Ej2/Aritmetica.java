package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_10.Ej2;

public class Aritmetica {
    // Variables de instancia (objetos)
    private int numA;
    private int numB;
    private int resultado;

    // Método para sumar dos números
    public int sumar(int a, int b) {
        numA = a;
        numB = b;
        resultado = numA + numB;
        return resultado;
    }

    // Sobrecarga del método sumar para sumar tres números
    public int sumar(int a, int b, int c) {
        numA = a;
        numB = b;
        resultado = numA + numB + c;
        return resultado;
    }

    // Método para restar dos números
    public int restar(int a, int b) {
        numA = a;
        numB = b;
        resultado = numA - numB;
        return resultado;
    }

    // Sobrecarga del método restar para restar tres números
    public int restar(int a, int b, int c) {
        numA = a;
        numB = b;
        resultado = numA - numB - c;
        return resultado;
    }

    // Sobreescritura del método toString()
    @Override
    public String toString() {
        return "Aritmetica{" +
                "numA=" + numA +
                ", numB=" + numB +
                ", resultado=" + resultado +
                '}';
    }
}