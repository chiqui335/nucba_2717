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

        Mascota mascota; //variable para una instancia mascota o sus subclases (sin objeto)

        switch (opcionMascota) {
            case 1:
                mascota = new Canino(); //se asigna un objeto canino a mascota
                mascota.datosMascota();
                System.out.println(mascota.toString());
                break;
            
            case 2:
                mascota = new Felino();
                mascota.datosMascota();
                System.out.println(mascota.toString());
                break;

            case 3:
                mascota = new Felino();
                mascota.datosMascota();
                System.out.println(mascota.toString());
                break;

            case 4:
                mascota = new Felino();
                mascota.datosMascota();
                System.out.println(mascota.toString());
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


    
    public String generarTicket() {
        // Implementación del ticket
        return "TICKET DE ADOPCIÓN...\n" +
               "Datos del Adoptante: " + adoptante.getNombre() + "\n" +
               "Datos de la Mascota: " + mascota.nombre + "\n" +
               "Empleado Encargado: " + empleado.getNombre() + "\n" +
               "Fecha de adopcion: " + this.fechaAdopcion + "\n";
    }
}
