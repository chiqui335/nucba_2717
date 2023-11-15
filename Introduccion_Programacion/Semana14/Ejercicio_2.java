package Introduccion_Programacion.Semana14;

import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String nombres[] = new String [3];
    double precio[] = new double [3];

    String prod;
    double prec;

    for(int i = 0; i < nombres.length; i++) {
        System.out.println("ingrese nombre del producto: ");
        prod = sc.nextLine();
        System.out.println("ingrese precio del producto: ");
        prec = sc.nextDouble();

        sc.nextLine();
        //nombres[i] = prod;
        //precios[i] = prec;
    }
    mostrarLista(prod, prec);
    double total = calcularTotal(precz);
    System.out.println ("monto total: " +total);
    }

    public static int calcularTotal(double p[]){
        double tot=0;
        for(int i = 0; i < p.length; i++){
            tot+=p[i];
        }
        return tot; 
    }
    public static void mostrarLista(String[] n, double[] p){
        //n y p son arrays y son var locales
        for(int i=0; i<n.length; i++){
            System.out.println(n[i]+ "..."+p[i]);
        }
    }
}

