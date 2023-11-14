package Introduccion_Programacion.Semana14;

import java.util.Scanner;
public class Ejercicio_1 {
    public static int[] MayorAMenor(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMaximo = i;

            // Encontrar el índice del elemento máximo en el resto del array
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[indiceMaximo]) {
                    indiceMaximo = j;
                }
            }

            // Intercambiar el elemento actual con el máximo encontrado
            int temp = array[i];
            array[i] = array[indiceMaximo];
            array[indiceMaximo] = temp;
        }

        return array; // Devuelve el array ordenado
    }

    public static int search (int[] array, int elemento) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {12, 23, 34, 45, 56};

        // Llamado a la función para ordenar el array de mayor a menor
        int[] arrayOrdenado = MayorAMenor(numeros);

        // Mostrar el array ordenado de mayor a menor
        System.out.print("Array ordenado de mayor a menor: [");
        for (int i = 0; i < arrayOrdenado.length; i++) {
            System.out.print(arrayOrdenado[i]);
            if (i < arrayOrdenado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("ingrese elemento a buscar");
        int buscar = sc.nextInt();

        int indiceEncontrado = search (arrayOrdenado, buscar);

        if(indiceEncontrado != -1) {
            System.out.println("El elemento " + buscar + " se encuentra en el índice " + indiceEncontrado + ".");
        } else {
            System.out.println("El elemento " + buscar + " no se encuentra en el array.");
        }
        sc.close();
    }
}
