package Introduccion_Programacion.Desafios;

import java.util.Scanner;

public class Semana7_ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a calcular el rango: ");
        int n = sc.nextInt();

        System.out.println("Ingrese primer numero: ");
        int numero;
        int primerNumero = sc.nextInt();
        int min = primerNumero;
        int max = primerNumero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();

            if (numero < min) {
                min = numero;
            }

            if (numero > max) {
                max = numero;
            }
        }

        int rango = max - min;
        System.out.println("El rango de los números ingresados es: " + rango);

        sc.close();
    }
}
