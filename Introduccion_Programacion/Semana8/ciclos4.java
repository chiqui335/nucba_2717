package Introduccion_Programacion.Semana8;

import java.util.Scanner;
public class ciclos4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N;
        
        do{
            System.out.println("ingrese un numero impar entre 5 y 14: ");
            N=sc.nextInt();
        }while(N <= 5 || N >= 14 || N % 2 == 0);
        //tiene que ser al reves de lo que quiero porque sino
        //vuelvo a entrar al loop
        for(int i=0; i<N; i++){
        System.out.println("Gracias");
    }
  }
}
