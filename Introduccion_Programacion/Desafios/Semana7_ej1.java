package Introduccion_Programacion.Desafios;

import java.util.Scanner;
public class Semana7_ej1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero y yo le mostraré la tabla de multiplicar del mismo");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++){
            int multi = numero * i;
            System.out.println(numero + " x " + i + " = " + multi);
        }
        sc.close();
    }
}
