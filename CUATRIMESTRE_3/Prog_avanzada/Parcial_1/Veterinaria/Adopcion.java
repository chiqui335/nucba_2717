package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Adopcion {


    private Adoptante adoptante;
    private Mascota mascota;
    private Empleado empleado;
    private LocalDate fechaAdopcion;

    public Adopcion(){
        
    }


    public Adopcion(Adoptante adoptante, Mascota mascota, Empleado empleado, LocalDate fechaAdopcion) {
        this.adoptante = adoptante;
        this.mascota = mascota;
        this.empleado = empleado;
        this.fechaAdopcion = fechaAdopcion;
    }

    public void setFechaAdopcion(LocalDate fechaAdopcion){
        this.fechaAdopcion = fechaAdopcion;
    }

    public void adoptarMascota(){

        Scanner scAdoptar = new Scanner(System.in);

        //datos empleado
        empleado = Empleado.getInstance();
        empleado.datosEmpleado();

        //datos adoptante
        //adoptante.datosAdoptante();
        System.out.println("Ingrese los datos del adoptante:");
        System.out.print("Nombre: ");
        String nombreAdoptante = scAdoptar.nextLine();

        System.out.print("Edad: ");
        int edadAdoptante = scAdoptar.nextInt();
        scAdoptar.nextLine();

        System.out.print("Dirección: ");
        String direccionAdoptante = scAdoptar.nextLine();

        System.out.println("ID:");
        int idAdoptante = scAdoptar.nextInt();
        scAdoptar.nextLine();

        adoptante = new Adoptante(nombreAdoptante, edadAdoptante, direccionAdoptante, idAdoptante);
        
        //datos mascota
        System.out.println("Ingrese los datos de la mascota");
        System.out.println("Nombre de la mascota: ");
        String nombreMascota = scAdoptar.nextLine(); //probar si funciona asi

        System.out.println("Peso de la mascota (en kg): ");
        double pesoMascota = scAdoptar.nextInt();
        scAdoptar.nextLine();

        System.out.println("Fecha de nacimiento de la mascota (formato yyyy-MM-dd): ");
        LocalDate fechaNacimientoMascota = leerFechaNacimiento(scAdoptar);

        

        //seleccionar la especie
        System.out.println("\nSeleccione la especie de la mascota: ");
        System.out.println("1. Canino");
        System.out.println("2. Felino");
        System.out.println("3. Ave");
        System.out.println("4. Reptil");
        System.out.println("5. Salir");

        

        int opcionMascota = scAdoptar.nextInt();

        //switch para la opcion elegida de especie de la mascota
        switch (opcionMascota) {
            case 1:
                String especie1 = "Canino";

                mascota = new Canino(nombreMascota, fechaNacimientoMascota, pesoMascota, especie1);
                break;
            
            case 2:
                String especie2 = "Felino";
                
                mascota = new Felino(nombreMascota, fechaNacimientoMascota, pesoMascota, especie2);

                mascota.cuidadosRecomendacion();
                break;

            case 3:
                String especie3 = "Ave";

                mascota = new Ave(nombreMascota, fechaNacimientoMascota, pesoMascota, especie3);
                break;

            case 4:
                String especie4 = "Reptil";                

                mascota = new Reptil(nombreMascota, fechaNacimientoMascota, pesoMascota, especie4);
                break;

            case 5:
                System.out.println("Saliendo del programa");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }



        boolean fechaValida = false;

        //Manejo de excepciones para el formato de fecha
        while (!fechaValida) {
            try {
                System.out.println("Ingresar la fecha de adopción (formato yyyy-MM-dd): ");
                String fechaEntrada = scAdoptar.next(); // Leer la entrada de la fecha

                LocalDate fechaAdopcion = LocalDate.parse(fechaEntrada); // Intentar convertir la fecha a LocalDate
                this.setFechaAdopcion(fechaAdopcion); // Si la conversion es exitosa, se asigna
                
                fechaValida = true; // Se rompe el ciclo
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha inválido. Por favor, use el formato yyyy-MM-dd.");
            }
        }

        scAdoptar.close();
    }

    public LocalDate leerFechaNacimiento(Scanner scM) throws DateTimeParseException {
        String fechaEntrada = scM.nextLine();
        
        try {
            return LocalDate.parse(fechaEntrada);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Formato de fecha inválido. El es formato yyyy-MM-dd.", fechaEntrada, e.getErrorIndex());
        }
    }
    
    public void generarTicket() {
        // Implementación del ticket
              System.out.println(
                "-----------------------------" + "\n" +
                "TICKET DE ADOPCIÓN" + "\n" +
                "-----------------------------" + "\n" +
                adoptante.toString() + "\n" +
                mascota.toString() + "\n" +
                empleado.toString() + "\n" +
                "-----------------------------" + "\n" +
                "Gracias por adoptar a una mascota!" + "\n" +
                "-----------------------------");
    }
}
