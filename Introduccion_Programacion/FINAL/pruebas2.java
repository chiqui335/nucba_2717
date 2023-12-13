package Introduccion_Programacion.FINAL;

public class pruebas2 {
    public static void main(String[] args){
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
        
        
 
         // Imprimir la matriz con los valores asignados
         for (int i = 0; i < deck.length; i++) {
             for (int j = 0; j < deck[i].length; j++) {
                 System.out.print(deck[i][j] + " ");
             }
             System.out.println();
         }
    }
}
