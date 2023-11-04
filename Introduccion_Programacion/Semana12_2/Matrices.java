package Introduccion_Programacion.Semana12_2;

public class Matrices {
    public static void main(String[] args){
        int matrix[][] = {{25, 36, 5, 58, 14}, {58, 12, 4, 7, 36}, {85, 1, 36, 57, 74}, {23, 14, 58, 7, 5}};
        int nF = matrix.length;
        int nC = matrix[0].length;
        int temp;

        for(int i = 0; i < nF; i++) {
            for (int j = 0; j < nC; j++) {
                temp = matrix[i][j];
                System.out.print(temp + ", ");
            }
            System.out.println();
        }

        int counter = 0;
        for(int i = 0; i < nF; i++) {
            for(int j = 0; j < nC; j++) {
                temp = matrix[i][j]; 
                if(temp == 7) {
                    counter++;
                    System.out.println("Se encontró un 7");
                }
            }
        }
        System.out.println("El número 7 apareció " + counter + " veces");
    }
}

