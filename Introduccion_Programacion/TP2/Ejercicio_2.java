package Introduccion_Programacion.TP2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero y el programa le mostrará la tabla del mismo");
        
        while (!sc.hasNextInt()) {  // compruebo si el valor ingresado es entero
            System.out.println("Error, se debe ingresar un numero entero, intente denuevo");
            sc.next();
            System.out.println("Ingrese un numero entero y el programa le mostrará la tabla del mismo");
        }
            int User = sc.nextInt();

            for (int i = 0; i <= 10; i++) {
                int resultado = User * i;
                System.out.println(User + " x " + i + " = " + resultado);
            } 
        sc.close();
    }
}
