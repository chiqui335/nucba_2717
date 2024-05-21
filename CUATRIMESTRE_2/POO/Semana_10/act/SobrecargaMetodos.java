package CUATRIMESTRE_2.POO.Semana_10.act;




public class SobrecargaMetodos {
    
    private int resultadoI;
    private double resultadoD;

    public int multiplicar (int a, int b){
        resultadoI = a * b;
        return resultadoI;
    }

    public double multiplicar (double a, double b){
        resultadoD = a * b;
        return resultadoD;
    }

    public int multiplicar (int a, int b, int c){
        resultadoI = a * b * c;
        return resultadoI;
    }

    public String toString() {
        return "resultado entero: " + resultadoI  + "\n" +  
        "Resultado double: " + resultadoD + "\n" +  
        "Resultado 3ple multiplicacion: " + resultadoI;
    }
}
