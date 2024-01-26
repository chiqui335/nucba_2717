package Introduccion_Programacion.FINAL;

import java.util.Scanner;

public class Mini_truco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] deck = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    // Obtén las dimensiones del array
    int filas = deck.length;
    int columnas = deck[0].length;

    // Genera índices aleatorios
    int filaAleatoria = (int) (Math.random() * filas);
    int columnaAleatoria = (int) (Math.random() * columnas);

    // Accede al elemento del array utilizando los índices aleatorios
    int elementoSeleccionado = deck[filaAleatoria][columnaAleatoria];

    // Imprime el elemento seleccionado
    System.out.println("Elemento seleccionado: " + elementoSeleccionado);
    }
}
