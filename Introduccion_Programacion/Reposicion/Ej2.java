package Introduccion_Programacion.Reposicion;

import java.util.Scanner;
public class Ej2 {
  public static void main(String[] args) {
    System.out.print("elija comando 1) Prelavado 2) Lavado 3) Enjuague 4) Centrifugado 5) Secado"); 
    Scanner sc = new Scanner(System.in);
    Integer a = sc.nextInt();

    switch(a){
		case 1:
			System.out.println("Prelavando...");
		case 2:
			System.out.println("Lavando...");
		case 3:
			System.out.println("Enjuagando...");
		case 4:
			System.out.println("Centrifugando");
		case 5:
			System.out.println("Secando...");
			System.out.println("Finalizado.");
            break;
		default:
			System.out.println("Opcion invalida");
            break;
		}
    sc.close();
    }
}