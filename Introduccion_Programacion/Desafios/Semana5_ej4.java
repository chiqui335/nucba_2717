package Introduccion_Programacion.Desafios;

import java.util.Scanner;

public class Semana5_ej4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero ");
        int n1 = sc.nextInt();

        System.out.println("Ingrese un segundo numero ");
        int n2 = sc.nextInt();

        if((n1 > n2) && (n2 != 0)){
            System.out.println(n1 / n2);
        } else {
            System.out.println("Error: el segundo numero debe ser menor al primero y distinto de 0");
        }
        sc.close();
    }
}

