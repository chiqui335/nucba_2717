package Introduccion_Programacion.Semana7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Inicio el scanner
        Scanner sc = new Scanner(System.in);

        // Pido input de la nota
        System.out.println("Ingrese una nota");
        int nota = sc.nextInt();

        // Declaro la variable notaEscrita
        String notaEscrita;

        // Evalúo la nota
        switch (nota) {
            case 10:
                notaEscrita = "Diez";
                break;
            case 9:
                notaEscrita = "Nueve";
                break;
            case 8:
                notaEscrita = "Ocho";
                break;
            case 7:
                notaEscrita = "Siete";
                break;
            case 6:
                notaEscrita = "Seis";
                break;
            case 5:
                notaEscrita = "Cinco";
                break;
            case 4:
                notaEscrita = "Cuatro";
                break;
            case 3:
                notaEscrita = "Tres";
                break;
            case 2:
                notaEscrita = "Dos";
                break;
            case 1:
                notaEscrita = "Uno";
                break;
            case 0:
                notaEscrita = "Cero";
                break;
            default:
                notaEscrita = "Nota fuera de rango";
                break;
        }
        sc.close();
        // Imprimo la nota escrita
        System.out.println("Nota en palabras: " + notaEscrita);
    }
}