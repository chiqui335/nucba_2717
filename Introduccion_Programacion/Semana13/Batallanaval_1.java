package Introduccion_Programacion.Semana13;

import java.util.Scanner;
public class Batallanaval_1 {
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
        int intentos = 0; // Contador de intentos del jugador
        int aciertos = 0; // Contador de aciertos del jugador
        boolean barcoHundido = false;

        while (!barcoHundido && intentos < 5) {
            System.out.println("Intento número: " + (intentos + 1)); // Mostrar el número de intento
            System.out.println("Ingrese la fila: ");
            int fila = sc.nextInt();
            System.out.println("Ingrese la columna: ");
            int columna = sc.nextInt();

            if (fila >= 0 && fila < 6 && columna >= 0 && columna < 6) { // Verificar que las coordenadas estén dentro de los límites de la matriz
                if (matrizA[fila][columna] == 'B') {
                    matrizA[fila][columna] = 'x';
                    matrizB[fila][columna] = 'x';
                    intentos++; // Incrementar el contador de intentos
                    aciertos++; // Incrementar el contador de aciertos

                    // Mostrar tablero del jugador
                    System.out.println("Tablero: ");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(matrizB[i][j] + " ");
                        }
                        System.out.println();
                    }

                    if (aciertos == 3) {
                        System.out.println("Barco hundido");
                        barcoHundido = true;
                    }
                } else {
                    matrizA[fila][columna] = 'o';
                    matrizB[fila][columna] = 'o';
                    System.out.println("Agua, intenta de nuevo");

                    // Mostrar tablero del jugador
                    System.out.println("Tablero: ");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(matrizB[i][j] + " ");
                        }
                        System.out.println();
                    }

                    intentos++; // Incrementar el contador de intentos
                }
            } else {
                System.out.println("Coordenadas inválidas. Deben estar entre 0 y 5.");
            }
        }

        if (aciertos < 3) {
            System.out.println("¡Lo siento! No lograste hundir el barco en 5 intentos. Has perdido.");
        }

        sc.close();
    }
}