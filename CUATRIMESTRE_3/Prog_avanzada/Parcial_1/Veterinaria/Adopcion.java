package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
import java.util.Scanner;

public class Adopcion {
    private Adoptante adoptante;
    private Mascota mascota;
    private Empleado empleado;
    private LocalDate fechaAdopcion;


    public Adopcion(Adoptante adoptante, Mascota mascota, Empleado empleado, LocalDate fechaAdopcion) {
        this.adoptante = adoptante;
        this.mascota = mascota;
        this.empleado = empleado;
        this.fechaAdopcion = fechaAdopcion;
    }

    public void adoptarMascota(){

        System.out.println("\nSeleccione la especie de la mascota: ");
        System.out.println("1. Canino");
        System.out.println("2. Felino");
        System.out.println("3. Ave");
        System.out.println("4. Reptil");
        System.out.println("5. Salir");

        Scanner scAdoptar = new Scanner(System.in);

        int opcionMascota = scAdoptar.nextInt();

        switch (opcionMascota) {
            case 1:
                Canino canino = new Canino();
                canino.datosMascota();
                System.out.println(canino.toString());
                break;
            
            case 2:
                Felino felino = new Felino();
                felino.datosMascota();
                System.out.println(felino.toString());
                break;

            case 3:
                Felino ave = new Felino();
                ave.datosMascota();
                System.out.println(ave.toString());
                break;

            case 4:
                Felino reptil = new Felino();
                reptil.datosMascota();
                System.out.println(reptil.toString());
                break;

            case 5:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        scAdoptar.close();
    }

    public void menuAdopcion(){

    }
    
    public String generarTicket() {
        // Implementación del ticket
        return "TICKET DE ADOPCIÓN...\n" +
               "Datos del Adoptante: " + adoptante.getNombre() + "\n" +
               "Datos de la Mascota: " + mascota.nombre + "\n" +
               "Empleado Encargado: " + empleado.getNombre() + "\n" +
               "Fecha de adopcion: " + this.fechaAdopcion + "\n";
    }
}
