package Introduccion_Programacion.Desafios;

import java.util.Scanner;

public class Semana7_ej2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un numero: ");
    double number = sc.nextDouble();
    double redondo = Math.round(number);
    
    if ((number < 0) || (number != redondo)) {
        System.out.println("en numero debe ser entero y positivo");
    }else {
        int Suma = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                Suma += i;
            }
        }
        System.out.println("La suma de los números impares desde 1 hasta " + redondo + " es: " + Suma);
    }
    sc.close();
  }
}