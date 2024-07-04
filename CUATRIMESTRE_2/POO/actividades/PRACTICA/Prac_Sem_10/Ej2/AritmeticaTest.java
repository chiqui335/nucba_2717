package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_10.Ej2;

public class AritmeticaTest {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();

        // Probar la suma de dos números
        int suma1 = aritmetica.sumar(5, 3);
        System.out.println("Suma de 5 y 3: " + suma1);
        System.out.println(aritmetica.toString()); // Imprime el estado del objeto

        // Probar la suma de tres números
        int suma2 = aritmetica.sumar(5, 3, 2);
        System.out.println("Suma de 5, 3 y 2: " + suma2);
        System.out.println(aritmetica.toString()); // Imprime el estado del objeto

        // Probar la resta de dos números
        int resta1 = aritmetica.restar(5, 3);
        System.out.println("Resta de 5 y 3: " + resta1);
        System.out.println(aritmetica.toString()); // Imprime el estado del objeto

        // Probar la resta de tres números
        int resta2 = aritmetica.restar(5, 3, 2);
        System.out.println("Resta de 5, 3 y 2: " + resta2);
        System.out.println(aritmetica.toString()); // Imprime el estado del objeto
    }
}
