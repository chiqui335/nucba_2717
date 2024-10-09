package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
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
        System.out.println("Ingrese los datos del adoptante:");

        //nombre
        System.out.print("Nombre: ");
        String nombreAdoptante = scAdoptar.nextLine();

        //edad
        int edadAdoptante = -1; //incializo 
        while (edadAdoptante == -1) {
            try {
                System.out.print("Edad: ");
                edadAdoptante = scAdoptar.nextInt();  // Puede lanzar InputMismatchException

                if (edadAdoptante <= 0) {
                    System.out.println("Por favor, introduce una edad válida (mayor a 0).");
                    edadAdoptante = -1;  // Reiniciar para que el ciclo vuelva a pedir la edad
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido para la edad.");
                scAdoptar.nextLine();  // Asi evito bucles infinitos
            }
        }

        scAdoptar.nextLine();  

        //id
        int idAdoptante = -1;
        while (idAdoptante == -1) {
            try {
                System.out.println("ID:");
                idAdoptante = scAdoptar.nextInt();  // Puede lanzar InputMismatchException

                if (idAdoptante <= 0) {
                    System.out.println("Por favor, introduce un ID válido (mayor a 0).");
                    idAdoptante = -1;  // Reiniciar para que el ciclo vuelva a pedir el ID
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido para el ID.");
                scAdoptar.nextLine(); 
            }
        }

        scAdoptar.nextLine();

        //direccion
        System.out.print("Dirección: ");
        String direccionAdoptante = scAdoptar.nextLine();

        adoptante = new Adoptante(nombreAdoptante, edadAdoptante, direccionAdoptante, idAdoptante); //se crea el objeto con los parametros
        
        //datos mascota
        System.out.println("Ingrese los datos de la mascota");

        //nombre
        System.out.println("Nombre de la mascota: ");
        String nombreMascota = scAdoptar.nextLine(); //probar si funciona asi


        //peso
        double pesoMascota = -1; 

        while (pesoMascota == -1) {
            try {
                System.out.println("Peso de la mascota (en kg): ");
                pesoMascota = scAdoptar.nextDouble();  

                if (pesoMascota <= 0) {
                    System.out.println("Por favor, introduce un peso válido (mayor a 0).");
                    pesoMascota = -1;  
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido para el peso.");
                scAdoptar.nextLine();  
            }
        }

        scAdoptar.nextLine();


        //fecha de nacimiento
        System.out.println("Fecha de nacimiento de la mascota (formato yyyy-MM-dd): ");
        LocalDate fechaNacimientoMascota = leerFechaNacimiento(scAdoptar);



        //seleccionar la especie
        mostrarMenu();
        

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

    public static LocalDate leerFechaNacimiento(Scanner scAdoptar) throws DateTimeParseException {
        boolean fechaValida = false; // Variable de control para el bucle
        LocalDate fechaNacimiento = null; // Variable para almacenar la fecha válida

        while (!fechaValida) { // Bucle que se ejecuta mientras la fecha no sea válida
            String fechaEntrada = scAdoptar.nextLine(); // Leer la entrada

            try {
                fechaNacimiento = LocalDate.parse(fechaEntrada); // Convierto la fecha a LocalDate
                fechaValida = true;                              // Si la conversion es exitosa, se rompe el ciclo
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha inválido en el índice " + e.getErrorIndex() + ". Por favor, use el formato yyyy-MM-dd.");
            }
        }
        
        return fechaNacimiento; // Retorno la fecha valida
    }


    public void mostrarMenu(){
        System.out.println("\nSeleccione la especie de la mascota: ");
        System.out.println("1. Canino");
        System.out.println("2. Felino");
        System.out.println("3. Ave");
        System.out.println("4. Reptil");
        System.out.println("5. Salir");
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
