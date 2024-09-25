package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ave extends Mascota{

    private String tipo;

    public Ave(){
        super();
    }

    public Ave(String nombre, LocalDate fechaNacimiento, double peso) {
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

        System.out.println("Ingrese los datos del ave");
        System.out.println("Nombre: ");
        String nombreAve = scM.nextLine(); //probar si funciona asi
        this.setNombre(nombreAve);

        System.out.println("Peso: ");
        double pesoAve = scM.nextInt();
        this.setPeso(pesoAve);
        scM.nextLine();

        System.out.println("Fecha de nacimiento (formato yyyy-MM-dd): ");
        LocalDate fechaNacimientoAve = leerFechaNacimiento(scM);
        this.setFechaNacimiento(fechaNacimientoAve);

        System.out.println("Tipo: ");
        String tipoAve = scM.nextLine();
        this.setTipo(tipoAve);

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
        System.out.println("Cuidados del Ave: Jaula amplia, variedad en la dieta, iluminacion suficiente, temperatura templada.");
    }

    public String toString(){
        return "Nombre: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Peso: " + peso + ", Raza: " + tipo;
    }
}
