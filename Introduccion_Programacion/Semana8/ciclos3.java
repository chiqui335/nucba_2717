package Introduccion_Programacion.Semana8;

import java.util.Scanner;

public class ciclos3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   //scanner
        
        String nom;
        char pri, ult;
        int tam;

        do{
            System.out.println("ingrese su nombre, primera letra en mayuscula y que termine en punto: ");
            nom=sc.nextLine();
            pri=nom.charAt(0);
            tam=nom.length();
            ult=nom.charAt(tam-1);
        }while(pri<'A' || pri >'Z' || ult!='.'); 
        System.out.println("Gracias "+nom);
        sc.close();
    }
}
