package Introduccion_Programacion.Semana13;

import java.util.Scanner;

public class Batallanaval_2 {
     public static void main(String[] args) {
        char[][] matrizA = new char[6][6];
        char[][] matrizB = new char[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizA[i][j] = '-';
                matrizB[i][j] = '#';
            }
        }

        matrizA[1][1] = 'B';
        matrizA[1][2] = 'B';
        matrizA[1][3] = 'B';

        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        int intentos = 0; // Contador de intentos del jugador

        while (!encontrado && intentos < 3) { // Bucle limitado a 3 intentos
            System.out.println("Intento número: " + (intentos + 1)); // Mostrar el número de intento
            System.out.println("Ingrese la fila: ");
            int fila = sc.nextInt();
            System.out.println("Ingrese la columna: ");
            int columna = sc.nextInt();

            if (fila >= 0 && fila < 6 && columna >= 0 && columna < 6) { // Verificar que las coordenadas estén dentro de los límites de la matriz
                if (matrizA[fila][columna] == 'B') {
                    encontrado = true;
                    matrizA[fila][columna] = 'x';
                    matrizB[fila][columna] = 'x';
                } else {
                    matrizA[fila][columna] = 'o';
                    matrizB[fila][columna] = 'o';
                }

                // Mostrar tableros
                System.out.println("Tablero del jugador: ");
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(matrizB[i][j] + " ");
                    }
                    System.out.println();
                }

                intentos++; // Incrementar el contador de intentos
            } else {
                System.out.println("Coordenadas inválidas. Deben estar entre 0 y 5.");
            }
        }

        if (encontrado) {
            System.out.println("¡Felicidades! Has encontrado el barco.");
        } else {
            System.out.println("Se han agotado los intentos. ¡Mejor suerte la próxima!");
        }

        sc.close();
    }
}

