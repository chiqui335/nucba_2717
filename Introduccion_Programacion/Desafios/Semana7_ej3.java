package Introduccion_Programacion.Desafios;

import java.util.Scanner;

public class Semana7_ej3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero y positivo: ");
        double n = sc.nextDouble();
        double redondo = Math.round(n);
        

        if((n < 0) || (n != redondo)){
            System.out.println("El numero debe ser positivo y entero");
    }else{
      for (int i = 1; i <= n; i++){
        int Par = 2 * i;
        System.out.println(Par);
      }
    }
    sc.close();
  }
}