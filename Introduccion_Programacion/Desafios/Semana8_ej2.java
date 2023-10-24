package Introduccion_Programacion.Desafios;

import java.util.Scanner;
public class Semana8_ej2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Desocupados = 0;
        int Hasta500 = 0;
        int Entre500y1000 = 0;
        int Entre1000y2000 = 0;
        int Masde2000 = 0;

        double sueldoMax = 0;
        String nombreMax = "";

        double totalSueldos = 0;

        System.out.print("Ingrese la cantidad de personas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Nombre de la persona " + i + ": ");
            String nombre = sc.next();

            System.out.println("Sueldo de " + nombre + ": ");
            double sueldo = sc.nextDouble();

            totalSueldos += sueldo;

            if (sueldo == 0){
                Desocupados++;
            }else if (sueldo <= 500){
                Hasta500++;
            }else if (sueldo <= 1000){
                Entre500y1000++;
            }else if (sueldo <= 2000){
                Entre1000y2000++;
            }else {
                Masde2000++;
            }

            if (sueldo > sueldoMax){
                sueldoMax = sueldo;
                nombreMax = nombre;
            }
        }
        System.out.println("Cantidad de desocupados: " + Desocupados);
        System.out.println("Cantidad de personas que cobran hasta 500$: " +Hasta500);
        System.out.println("Cantidad de personas que cobran entre 500$ y 1000$: " + Entre500y1000);
        System.out.println("Cantidad de personas que cobran entre 1000$ y 2000$: " + Entre1000y2000);
        System.out.println("Cantidad de personas que superan los 2000$: " + Masde2000);

        System.out.println("Sueldo máximo: " + sueldoMax);
        System.out.println("Nombre de la persona con sueldo máximo: " + nombreMax);

        System.out.println("Total de sueldos pagados: " + totalSueldos);

        sc.close();
    }
}
