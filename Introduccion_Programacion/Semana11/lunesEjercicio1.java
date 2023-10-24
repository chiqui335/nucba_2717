package Introduccion_Programacion.Semana11;

import java.util.Scanner;
public class lunesEjercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int vectorNum[] = {24, 50, 14, 9};
        int userNum[] = new int[4];

        System.out.println("ingrese 4 valores para el array");
        for (int i = 0; i < 4; i++) {
            System.out.println("Valor "+ (i+1) + ": ");
            userNum[i] = sc.nextInt();
        }

        boolean Same = true;
        for(int i = 0; i < 4; i++) {
            if (vectorNum[i] != userNum[i]) {
                Same = false;
                //System.out.println("Los vectores no son iguales");
            } else {
                //System.out.println("Los vectores son iguales");
            }
    }
    if (Same == true) {
        System.out.println("Los vectores son iguales");
    } else {
        System.out.println("Los vectores no son iguales");
    }
    sc.close();
  }
}