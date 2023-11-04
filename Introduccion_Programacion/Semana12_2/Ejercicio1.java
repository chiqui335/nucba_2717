package Introduccion_Programacion.Semana12_2;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][3];

        int nF = matrix.length; 
        int nC = matrix[0].length; 

        for (int j = 0; j < nC; j++) {      
            for (int i = 0; i < nF; i++) { 
                System.out.println("Ingrese el valor para la fila " + (i) + " y columna " + (j) + ":");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int pares = 0; int impares = 0;

        for (int j = 0; j < nC; j++) {
            for (int i = 0; i < nF; i++) {
                if (matrix[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }   
        }
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares " + impares);

        sc.close();
    }    
}
