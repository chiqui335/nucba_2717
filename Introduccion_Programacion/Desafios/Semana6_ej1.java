package Introduccion_Programacion.Desafios;

import java.util.Scanner;
public class Semana6_ej1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double price = 3.70;

        System.out.println("Ingrese cantidad de dias de estancia");
        int days = sc.nextInt();

        System.out.println("Ingrese cuantos kilometros de recorrido de tren son");
        int distance = sc.nextInt();

        double total = distance * price;
        if((days > 7) && (distance > 800)){
            double discount = total * 0.70;
            System.out.println("El precio que debe pagar es: " + discount + " usted obtuvo un 30% de descuento");
        } else {
            System.out.println("El precio que debe pagar es: " + total);
        }
        sc.close();
    }
}
