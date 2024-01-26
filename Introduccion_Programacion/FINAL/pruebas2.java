package Introduccion_Programacion.FINAL;

import javax.swing.*;
public class pruebas2 {
    public static void main(String[] args){

        //ARMO EL MAZO
        int deck [][] = new int [8][5];

         // Asignar valores a cada elemento de la matriz
        deck [0][0] = 13;   //ancho espada
        deck [0][1] = 12;   //ancho basto
        deck [0][2] = 11;   //7 espada
        deck [0][3] = 10;   //7 oro
        deck [0][4] = 9;    //los 3 de los 4 palos
        deck [1][0] = 9;
        deck [1][1] = 9;
        deck [1][2] = 9;
        deck [1][3] = 8;    //los 2 de los 4 palos
        deck [1][4] = 8;
        deck [2][0] = 8;
        deck [2][1] = 8;
        deck [2][2] = 7;    //los ancho falso
        deck [2][3] = 7;
        deck [2][4] = 6;    //los 12
        deck [3][0] = 6;
        deck [3][1] = 6;
        deck [3][2] = 6;
        deck [3][3] = 5;    //los 11
        deck [3][4] = 5;
        deck [4][0] = 5;
        deck [4][1] = 5;
        deck [4][2] = 4;    //los 10
        deck [4][3] = 4;
        deck [4][4] = 4;
        deck [5][0] = 4;
        deck [5][1] = 3;    //7 de basto y copa
        deck [5][2] = 3;
        deck [5][3] = 2;    //los 6
        deck [5][4] = 2;
        deck [6][0] = 2;
        deck [6][1] = 2;
        deck [6][2] = 1;    //los 5
        deck [6][3] = 1;
        deck [6][4] = 1;
        deck [7][0] = 1;
        deck [7][1] = 0;    //los 4
        deck [7][2] = 0;
        deck [7][3] = 0;
        deck [7][4] = 0;

        //forma mas compacta de conseguir lo de arriba
        // int[][] deck = new int[8][5];
        // int valor = 13;
        
        // for (int i = 0; i < 8; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         deck[i][j] = valor;
        //         if (j < 4) {
        //             if (valor > 0) {
        //                 valor--;
        //             } else {
        //                 valor = 9;
        //             }
        //         }
        //     }
        // }        


        String [][] deckImg = new String[8][5];

        deckImg [0][0] = " /Cartas/esp1.png";   //ancho espada
        deckImg [0][1] = "/Cartas/basto1.png";   //ancho basto
        deckImg [0][2] = "/Cartas/esp7.png";   //7 espada
        deckImg [0][3] = "/Cartas/oro7.png";   //7 oro
        deckImg [0][4] = "/Cartas/esp3.png";    //los 3 de los 4 palos
        deckImg [1][0] = "/Cartas/oro3.png";
        deckImg [1][1] = "/Cartas/basto3.png";
        deckImg [1][2] = "/Cartas/copa3.png";
        deckImg [1][3] = "/Cartas/esp2.png";    //los 2 de los 4 palos
        deckImg [1][4] = "/Cartas/oro2.png";
        deckImg [2][0] = "/Cartas/basto2.png";
        deckImg [2][1] = "/Cartas/copa2.png";
        deckImg [2][2] = "/Cartas/oro1.png";    //los ancho falso
        deckImg [2][3] = "/Cartas/copa1.png";
        deckImg [2][4] = "/Cartas/esp12.png";    //los 12
        deckImg [3][0] = "/Cartas/oro12.png";
        deckImg [3][1] = "/Cartas/basto12.png";
        deckImg [3][2] = "/Cartas/copa12.png";
        deckImg [3][3] = "/Cartas/esp11.png";    //los 11
        deckImg [3][4] = "/Cartas/oro11.png";
        deckImg [4][0] = "/Cartas/basto11.png";
        deckImg [4][1] = "/Cartas/copa11.png";
        deckImg [4][2] = "/Cartas/esp10.png";    //los 10
        deckImg [4][3] = "/Cartas/oro10.png";
        deckImg [4][4] = "/Cartas/basto10.png";
        deckImg [5][0] = "/Cartas/copa10.png";
        deckImg [5][1] = "/Cartas/basto7.png";    //7 de basto y copa
        deckImg [5][2] = "/Cartas/copa7.png";
        deckImg [5][3] = "/Cartas/esp6.png";    //los 6
        deckImg [5][4] = "/Cartas/oro6.png";
        deckImg [6][0] = "/Cartas/basto6.png";
        deckImg [6][1] = "/Cartas/copa6.png";
        deckImg [6][2] = "/Cartas/esp5.png";    //los 5
        deckImg [6][3] = "/Cartas/oro5.png";
        deckImg [6][4] = "/Cartas/basto5.png";
        deckImg [7][0] = "/Cartas/copa5.png";
        deckImg [7][1] = "/Cartas/esp4.png";    //los 4
        deckImg [7][2] = "/Cartas/oro4.png";
        deckImg [7][3] = "/Cartas/basto4.png";
        deckImg [7][4] = "/Cartas/copa4.png";
    
        
 
         // Imprimir la matriz con los valores asignados
         for (int i = 0; i < deck.length; i++) {
             for (int j = 0; j < deck[i].length; j++) {
                 System.out.print(deck[i][j] + " ");
             }
             System.out.println();
         }

         //----------------------------------------------------------------

        //Seccion para repartir las cartas
        //reparto 3 cartas al usuario

        // int [][] cartasUser = repartirRand(deck, deckImg, 3);

        // mostrarCartas(cartasUser, deckImg, "Cartas del usuario");

        // //reparto 3 cartas a la CPU

        // int [][] cartasCPU = repartirRand(deck, deckImg, 3);

        // mostrarCartas(cartasUser, deckImg, "Cartas de la CPU");


        int filaDeck = deck.length;
        int colDeck = deck[0].length;

        //genero un random para la carta 1:

        int filaDeckRand1 =  (int) (Math.random() * filaDeck);
        int colDeckRand1 =   (int) (Math.random() * colDeck);

        //carta 2
        int filaDeckRand2 =  (int) (Math.random() * filaDeck);
        int colDeckRand2 =   (int) (Math.random() * colDeck);

        //carta 3
        int filaDeckRand3 =  (int) (Math.random() * filaDeck);
        int colDeckRand3 =   (int) (Math.random() * colDeck);

        int carta_1 = deck[filaDeckRand1][colDeckRand1];
        int carta_2 = deck[filaDeckRand2][colDeckRand2];
        int carta_3 = deck[filaDeckRand3][colDeckRand3];


        System.out.println("Elemento seleccionado: " + carta_1);
        System.out.println("Elemento seleccionado: " + carta_2);
        System.out.println("Elemento seleccionado: " + carta_3);


        int filas = deck.length;
        int columnas = deck[0].length;

        // Genera índices aleatorios
        int filaAleatoria = (int) (Math.random() * filas);
        int columnaAleatoria = (int) (Math.random() * columnas);

        // Accede al elemento del array utilizando los índices aleatorios
        int elementoSeleccionado = deck[filaAleatoria][columnaAleatoria];

        // Imprime el elemento seleccionado
        System.out.println("Elemento: " + elementoSeleccionado);


    }
}
