package Introduccion_Programacion.TP2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de alumnos: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error, Ingrese un numero entero para la cantidad de alumnos, intente nuevamente");
            sc.next(); 
            System.out.println("Ingrese la cantidad de alumnos: ");
        }
        int CantAlumnos = sc.nextInt();

        String[] alumno = new String[CantAlumnos];
        int[] notas1 = new int[CantAlumnos];
        int[] notas2 = new int[CantAlumnos];
        int[] notas3 = new int[CantAlumnos];

        for (int i = 0; i < CantAlumnos; i++) {
            System.out.println("Ingrese nombre del alumno " + (i+1) +": ");
            alumno[i] = sc.next();


            System.out.print("Ingrese la nota del examen 1 para " + alumno[i] + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error, Ingrese una nota válida.");
                sc.next(); 
                System.out.print("Ingrese la nota del examen 1 para " + alumno[i] + ": ");
            }
            notas1[i] = sc.nextInt();

            System.out.print("Ingrese la nota del examen 2 para " + alumno[i] + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error, Ingrese una nota válida.");
                sc.next(); 
                System.out.print("Ingrese la nota del examen 2 para " + alumno[i] + ": ");
            }
            notas2[i] = sc.nextInt();

            System.out.print("Ingrese la nota del examen 3 para " + alumno[i] + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error, Ingrese una nota válida.");
                sc.next(); 
                System.out.print("Ingrese la nota del examen 3 para " + alumno[i] + ": ");
            }
            notas3[i] = sc.nextInt();
            
        }
        
        for (int i = 0; i < CantAlumnos; i++) {
            System.out.println("Alumno: " + alumno[i]);
            System.out.println("Nota Examen 1: " + notas1[i]);
            System.out.println("Nota Examen 2: " + notas2[i]);
            System.out.println("Nota Examen 3: " + notas3[i]);

            boolean aproboE1 = notas1[i] > 3;
            boolean aproboE2 = notas2[i] > 3;
            boolean aproboE3 = notas3[i] > 3;

            if (aproboE1 && aproboE2 && aproboE3) {
                System.out.println("el alumno " +alumno[i]+ " esta aprobado");
            } else {
                if (!aproboE1){
                    System.out.println("el alumno " +alumno[i]+ " debe ir a recuperatorio del examen 1");
                }
                if (!aproboE2){
                    System.out.println("el alumno " +alumno[i]+ " debe ir a recuperatorio del examen 2");
                }
                if (!aproboE3) {
                    System.out.println("el alumno " +alumno[i]+ " debe ir a recuperatorio del examen 3");
                }
            }
        }

        sc.close();
    }
}
