package Introduccion_Programacion.Semana8;

import java.util.Scanner;

public class Ciclos6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine().toLowerCase(); //Convertimos la palabra a minúsculas para simplificar la comparación
        
        int vocales=0; //defino el contador vocales y la pongo en 0
        
        for (int i=0; i<palabra.length(); i++) { //declaro una variable i en 0, despues pongo la concidion de que el bucle se ejecute mientras i sea menor que la longitud de la palabra (palabra.length())
            char letra = palabra.charAt(i);      //espués de cada iteración, aumenta el valor de i en 1 (i++) para avanzar al siguiente carácter en la palabra.
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') { //si la letrea es aeiou sumo el contador de vocales
                vocales++;
        }
    }
    System.out.println("La cantidad de vocales es: " + vocales);
    sc.close();
}
}


