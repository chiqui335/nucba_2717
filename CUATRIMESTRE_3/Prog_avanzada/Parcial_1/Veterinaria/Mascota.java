package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public abstract class Mascota {
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected double peso;

    public Mascota(){
        // Constructor vacío para herencia y creación de objetos de tipo Mascota.
    }

    public Mascota(String nombre, LocalDate fechaNacimiento, double peso) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }


    public void datosMascota() {
        Scanner scM = new Scanner(System.in);

        System.out.println("Ingrese los datos del felino");
        System.out.println("Nombre: ");
        String nombreMascota = scM.nextLine(); //probar si funciona asi
        this.setNombre(nombreMascota);

        System.out.println("Peso: ");
        double pesoMascota = scM.nextInt();
        this.setPeso(pesoMascota);
        scM.nextLine();

        System.out.println("Fecha de nacimiento (formato yyyy-MM-dd): ");
        LocalDate fechaNacimientoMascota = leerFechaNacimiento(scM);
        this.setFechaNacimiento(fechaNacimientoMascota);

        datosEspeficicos(scM);

        scM.close();
    }

    public static LocalDate leerFechaNacimiento(Scanner scM) throws DateTimeParseException {
        String fechaEntrada = scM.nextLine();
        
        try {
            return LocalDate.parse(fechaEntrada, DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Formato de fecha inválido. Asegúrate de usar el formato yyyy-MM-dd.", fechaEntrada, e.getErrorIndex());
        }
    }

    public abstract void datosEspeficicos(Scanner scM);


    public abstract void cuidadosRecomendacion();


    @Override
    public String toString() {
        return "Mascota: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Peso: " + peso + "kg";
    }
}
