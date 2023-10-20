package Introduccion_Programacion.Desafios;

import java.util.Scanner;
public class Semana5_ej1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    System.out.println("Ingrese un numero ");
    int numero1=sc.nextInt();

    System.out.println("Ingrese un segundo numero ");
    int numero2=sc.nextInt();

    int suma = numero1 + numero2;
    int resta = numero1 - numero2;
    int multi = numero1 * numero2;
    double potencia = Math. pow(numero1, numero2);
    
    System.out.println("suma: " + suma);
    System.out.println("resta: " + resta);
    System.out.println("Multiplicacion: " + multi);
    System.out.println("potencia: " + potencia);

    if (numero2 == 0){
        System.out.println("No se puede dividir por 0");
    }else{
        double division = numero1 / numero2;
        int modulo = numero1 % numero2;  
        System.out.println("division: " + division);
        System.out.println("modulo: " + modulo);
     }
     sc.close();
    }
}
