package Introduccion_Programacion.FINAL;

import java.util.Scanner;

public class Mini_truco {
    public static void main(String[] args) {

         // Asignar valores a cada elemento de la matriz
       int deck[][] = new int[4][10];

    // 0=espada; 1=basto; 2=oro; 3=copa
    deck[0][0] = 13;   // 1 espada
    deck[0][1] = 8;
    deck[0][2] = 9;
    deck[0][3] = 0;
    deck[0][4] = 1;
    deck[0][5] = 2;
    deck[0][6] = 11;
    deck[0][7] = 4;
    deck[0][8] = 5;
    deck[0][9] = 6;    //12 espada
    deck[1][0] = 12;   //1 basto
    deck[1][1] = 8;
    deck[1][2] = 9;
    deck[1][3] = 0;
    deck[1][4] = 1;
    deck[1][5] = 2;
    deck[1][6] = 3;
    deck[1][7] = 4;
    deck[1][8] = 5;
    deck[1][9] = 6;    //12 basto
    deck[2][0] = 7;    //1 oro
    deck[2][1] = 8;
    deck[2][2] = 9;
    deck[2][3] = 0;
    deck[2][4] = 1;
    deck[2][5] = 2;
    deck[2][6] = 10;
    deck[2][7] = 4;
    deck[2][8] = 5;
    deck[2][9] = 6;    //12 oro
    deck[3][0] = 7;    //1 copa
    deck[3][1] = 8;
    deck[3][2] = 9;
    deck[3][3] = 0;
    deck[3][4] = 1;
    deck[3][5] = 2;
    deck[3][6] = 3;
    deck[3][7] = 4;
    deck[3][8] = 5;
    deck[3][9] = 6;    //12 copa

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

    

    String [][] deckImg = new String [4][10];
 
        deckImg[0][0] = "/Cartas/esp1.png";
        deckImg[0][1] = "/Cartas/esp2.png";
        deckImg[0][2] = "/Cartas/esp3.png";
        deckImg[0][3] = "/Cartas/esp4.png";
        deckImg[0][4] = "/Cartas/esp5.png";
        deckImg[0][5] = "/Cartas/esp6.png";
        deckImg[0][6] = "/Cartas/esp7.png";
        deckImg[0][7] = "/Cartas/esp10.png";
        deckImg[0][8] = "/Cartas/esp11.png";
        deckImg[0][9] = "/Cartas/esp12.png";
        deckImg[1][0] = "/Cartas/basto1.png";
        deckImg[1][1] = "/Cartas/basto2.png";
        deckImg[1][2] = "/Cartas/basto3.png";
        deckImg[1][3] = "/Cartas/basto4.png";
        deckImg[1][4] = "/Cartas/basto5.png";
        deckImg[1][5] = "/Cartas/basto6.png";
        deckImg[1][6] = "/Cartas/basto7.png";
        deckImg[1][7] = "/Cartas/basto10.png";
        deckImg[1][8] = "/Cartas/basto11.png";
        deckImg[1][9] = "/Cartas/basto12.png";
        deckImg[2][0] = "/Cartas/oro1.png";
        deckImg[2][1] = "/Cartas/oro2.png";
        deckImg[2][2] = "/Cartas/oro3.png";
        deckImg[2][3] = "/Cartas/oro4.png";
        deckImg[2][4] = "/Cartas/oro5.png";
        deckImg[2][5] = "/Cartas/oro6.png";
        deckImg[2][6] = "/Cartas/oro7.png";
        deckImg[2][7] = "/Cartas/oro10.png";
        deckImg[2][8] = "/Cartas/oro11.png";
        deckImg[2][9] = "/Cartas/oro12.png";
        deckImg[3][0] = "/Cartas/copa1.png";
        deckImg[3][1] = "/Cartas/copa2.png";
        deckImg[3][2] = "/Cartas/copa3.png";
        deckImg[3][3] = "/Cartas/copa4.png";
        deckImg[3][4] = "/Cartas/copa5.png";
        deckImg[3][5] = "/Cartas/copa6.png";
        deckImg[3][6] = "/Cartas/copa7.png";
        deckImg[3][7] = "/Cartas/copa10.png";
        deckImg[3][8] = "/Cartas/copa11.png";
        deckImg[3][9] = "/Cartas/copa12.png";

    }
}
