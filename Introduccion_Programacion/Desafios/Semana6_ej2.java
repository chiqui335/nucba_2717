package Introduccion_Programacion.Desafios;

import java.util.Random;
import java.util.Scanner;
public class Semana6_ej2 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Genero un número aleatorio entre 1 y 5
        int numeroAleatorio = random.nextInt(5) + 1;
        int intentos = 0;

        System.out.println("Adivine el numero entre 1 y 5");

        while(true){
        System.out.println("Ingresa tu numero: ");
        int numero = sc.nextInt();
        intentos ++;

           if(numero > numeroAleatorio){
               System.out.println("Incorrecto, el numero es menor");
        } else if(numero < numeroAleatorio) {
                System.out.println("Incorrecto, el numero es mayor");
        } else {
                System.out.println("Correcto! El numero de intentos fue de " + intentos);
                break;
            } 
        } 
        sc.close();   
    } 
}
