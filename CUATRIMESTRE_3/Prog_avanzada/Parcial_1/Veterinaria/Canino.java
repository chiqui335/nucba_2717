package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Canino extends Mascota  {

    private String raza;

    public Canino(){
        //llamar al constructor padre
        super();
    }
    public Canino(String nombre, LocalDate fechaNacimiento, double peso, String raza) {
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

    //metodo que pide los datos del canino
    public void datosMascota() {
        Scanner scM = new Scanner(System.in);

        System.out.println("Ingrese los datos del canino");
        System.out.println("Nombre: ");
        String nombreCanino = scM.nextLine(); //probar si funciona asi
        this.setNombre(nombreCanino);

        System.out.println("Peso: ");
        double pesoCanino = scM.nextInt();
        this.setPeso(pesoCanino);
        scM.nextLine();

        System.out.println("Fecha de nacimiento (formato yyyy-MM-dd): ");
        LocalDate fechaNacimientoCanino = leerFechaNacimiento(scM);
        this.setFechaNacimiento(fechaNacimientoCanino);

        System.out.println("Raza: ");
        String razaCanino = scM.nextLine();
        this.setRaza(razaCanino);

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
        System.out.println("Cuidados del canino: paseos diarios, alimentación balanceada, control de garrapatas.");
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Peso: " + peso + ", Raza: " + raza;
    }
}
