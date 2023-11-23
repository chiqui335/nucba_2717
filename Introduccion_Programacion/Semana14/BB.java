package Introduccion_Programacion.Semana14;

import java.util.Scanner;

public class BB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         
        while(true){
            System.out.println("Ingrese un numero y el programa le mostrará la tabla del mismo");

            if (sc.hasNextInt()) {
            int User = sc.nextInt(); // compruebo si el valor ingresado es entero
            for (int i = 0; i <= 10; i++) {
                int resultado = User * i;
                System.out.println(User + " x " + i + " = " + resultado);
            } 
            break;
        }
        else {
            System.out.println("ERROR: Ingrese un numero entero valido por favor");
            sc.next();
            }
        }
        sc.close();
    }
}



