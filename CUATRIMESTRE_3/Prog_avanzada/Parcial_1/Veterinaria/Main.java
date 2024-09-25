package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Adopcion adopcion = new Adopcion();

        adopcion.adoptarMascota();

        adopcion.generarTicket();

        sc.close();




    }
}
