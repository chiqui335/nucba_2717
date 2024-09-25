package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Reptil extends Mascota {

    private String tipo;

    public Reptil(){
        super();
    }

    public Reptil(String nombre, LocalDate fechaNacimiento, double peso) {
        super(nombre, fechaNacimiento, peso);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //metodo que pide los datos de la mascota
    public void datosMascota() {
        Scanner scM = new Scanner(System.in);

        System.out.println("Ingrese los datos del reptil");
        System.out.println("Nombre: ");
        String nombreReptil = scM.nextLine(); //probar si funciona asi
        this.setNombre(nombreReptil);

        System.out.println("Peso: ");
        double pesoReptil = scM.nextInt();
        this.setPeso(pesoReptil);
        scM.nextLine();

        System.out.println("Fecha de nacimiento (formato yyyy-MM-dd): ");
        LocalDate fechaNacimientoReptil = leerFechaNacimiento(scM);
        this.setFechaNacimiento(fechaNacimientoReptil);

        System.out.println("Tipo: ");
        String tipoReptil = scM.nextLine();
        this.setTipo(tipoReptil);

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
        System.out.println("Cuidados del Reptil: Iluminacion natural, variedad en la dieta, temperatura cálida.");
    }

    public String toString(){
        return "Nombre: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Peso: " + peso + ", Raza: " + tipo;
    }
}
