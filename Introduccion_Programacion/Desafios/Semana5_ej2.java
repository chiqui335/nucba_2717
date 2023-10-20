package Introduccion_Programacion.Desafios;

import java.util.Scanner;

public class Semana5_ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero ");
        int n1 = sc.nextInt();

        System.out.println("Ingrese un segundo numero ");
        int n2 = sc.nextInt();

        if (sc.hasNextInt()) {
            if (n1 > n2) {
                System.out.println(n1 + " es mayor que " + n2);
            } else if (n1 < n2) {
                System.out.println(n2 + " es mayor que " + n1);
            } else {
                System.out.println("Los numeros son iguales");
            }
        } else {
            System.out.println("Error: No ingresaste un número entero.");
        }

        sc.close();
    }
}
