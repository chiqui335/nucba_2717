package Introduccion_Programacion.Desafios;

import java.util.Scanner;
import java.util.Random;
public class Semana9_ej1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int nAleatorio = rand.nextInt(100) + 1;

        int Attempts = 0;
        boolean guess = false;
        System.out.println("Adivina el numero entre 1 y 100");

        
        while (!guess) {
            int number = sc.nextInt();
            Attempts++;

            if (number == nAleatorio) {
                guess = true;
                System.out.println("Adivinaste! te costó " + Attempts + " intentos.");
            } else if (number < nAleatorio) {
                System.out.println("El numero es mayor, intenta otra vez");
            } else {
                System.out.println("El numero es menor, intenta otra vez");
            }
        }
        sc.close();
    }
}
