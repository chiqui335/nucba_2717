package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Felino extends Mascota {

    private String raza;
    
    public Felino(){
        //llamar al constructor padre
        super();
    }

    public Felino(String nombre, LocalDate fechaNacimiento, double peso, String raza) {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
    }

        //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void datosMascota() {
        Scanner scM = new Scanner(System.in);

        System.out.println("Ingrese los datos del felino");
        System.out.println("Nombre: ");
        String nombreFelino = scM.nextLine(); //probar si funciona asi
        this.setNombre(nombreFelino);

        System.out.println("Peso: ");
        double pesoFelino = scM.nextInt();
        this.setPeso(pesoFelino);
        scM.nextLine();

        System.out.println("Fecha de nacimiento (formato yyyy-MM-dd): ");
        LocalDate fechaNacimientoFelino = leerFechaNacimiento(scM);
        this.setFechaNacimiento(fechaNacimientoFelino);

        System.out.println("Raza: ");
        String razaFelino = scM.nextLine();
        this.setRaza(razaFelino);

        scM.close();
    }

        //metodo para leer la fecha de nacimiento
    public static LocalDate leerFechaNacimiento(Scanner scM) throws DateTimeParseException {
        String fechaEntrada = scM.nextLine();
        
        try {
            return LocalDate.parse(fechaEntrada, DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Formato de fecha inválido. Asegúrate de usar el formato yyyy-MM-dd.", fechaEntrada, e.getErrorIndex());
        }
    }

    public void cuidadosRecomendacion() {
        System.out.println("Cuidados del felino: cepillado, limpieza de arenero, control de la hidratacion.");
    }

    public String toString(){
        return "Nombre: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Peso: " + peso + ", Raza: " + raza;
    }
}
