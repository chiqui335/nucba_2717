package Introduccion_Programacion.TP2;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumaArray = 0;

        System.out.println("Ingrese la longitud del array: ");

        while (!sc.hasNextInt()) { //Bucle para confirmar que el usuario ingresa un valor valido para la longitud del array
            System.out.println("Error: Ingrese un valor entero para la longitud del array, intente nuevamente");
            sc.next(); 
            System.out.println("Ingrese la longitud del array: ");
        }
        
        int longitudArray = sc.nextInt();

        int[] array = new int[longitudArray];

        
        for (int i = 0; i < longitudArray; i++) {
            System.out.print("Ingrese el elemento en la posición " + i + ": ");

            while (!sc.hasNextInt()) { //Bucle para confirmar que el usuario ingresa un valor valido para el array
                System.out.println("Error: Ingrese un valor entero para el elemento del array, intente nuevamente");
                sc.next(); 
                System.out.print("Ingrese el elemento en la posición " + i + ": ");
            }
            array[i] = sc.nextInt();
        }


        for (int i = 0; i < longitudArray; i++) {
            sumaArray += array[i]; //suma de los elementos del array
        }
        System.out.println("La suma de los valores del array es igual a " + sumaArray);
        sc.close();
    }
}
