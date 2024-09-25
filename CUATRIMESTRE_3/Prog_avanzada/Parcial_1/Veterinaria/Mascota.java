package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;

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

    public abstract void cuidadosRecomendacion();

    public abstract void datosMascota();

    @Override
    public String toString() {
        return "Mascota: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Peso: " + peso + "kg";
    }
}
