package CUATRIMESTRE_2.POO.Semana_10.act;

public class pruebaAritmetica {

    public static void main(String[] args){

        Aritmetica aritmetica = new Aritmetica();


        // Prueba de método sumar con dos enteros
        System.out.println("Suma de 5 y 3: " + aritmetica.sumar(5, 3));

        // Prueba de método sumar con tres enteros
        System.out.println("Suma de 5, 3 y 2: " + aritmetica.sumar(5, 3, 2));

        // Prueba de método sumar con double
        System.out.println("Suma de 5.5 y 3.3: " + aritmetica.sumar(5.5, 3.3));

        // Prueba de método restar con dos enteros
        System.out.println("Resta de 5 y 3: " + aritmetica.restar(5, 3));

        // Prueba de método restar con double
        System.out.println("Resta de 5.5 y 3.3: " + aritmetica.restar(5.5, 3.3));

        // Prueba de método toString
        System.out.println(aritmetica);
    }
}
