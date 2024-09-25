package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //se piden los datos del empleado
        // empleado.datosEmpleado();
        // System.out.println(empleado.toString());


        //se piden los datos del adoptante
        // adoptante.datosAdoptante();
        // System.out.println(adoptante.toString());

        Adopcion adopcion = new Adopcion();

        adopcion.adoptarMascota();
        // System.out.println(adopcion.toString());

        adopcion.generarTicket();

        sc.close();




    }
}
