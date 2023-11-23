package Introduccion_Programacion.TP2;

import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int mayor = 0;
        
        while (true) {
            System.out.println("Ingrese un numero entero o cero (0) para finalizar el programa");

            if (sc.hasNextInt()) {  // compruebo si el valor ingresado es entero
                int User = sc.nextInt();
                
                if (User > mayor) {
                    mayor = User;
                } 
                
                if (User == 0) {
                    break;
                } 
            } else {
                System.out.println("Valor invalido, ingrese un numero entero o cero (0) para finalizar el programa");
                sc.next(); 
                }
        }
        System.out.println("El mayor de los numeros ingresados es " + mayor);
        sc.close();
    }
}
