package Introduccion_Programacion.Semana8;

import java.util.Scanner;
//ejercicio Dowhile
public class ciclos2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   //scanner
        String cad;         //cadena contenedor
        char i;
        int edad;
        do{
            System.out.println("Ingrese la inicial de su nombre: ");
            cad=sc.nextLine();
            i=cad.chartAt(0);
        }while(i<'A' || (i>'Z' && i<'a') || i>'z'); //si esta fuera del rango ASCII permitido
    }
}