package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;

public class Felino extends Mascota {
    
    public Felino(){
        //constructor default
        super();
    }

    public Felino(String nombre, LocalDate fechaNacimiento, double peso, String especie) {
        super(nombre, fechaNacimiento, peso, especie);
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

    //recomendacion
    public String cuidadosRecomendacion() {
        return "Cuidados del Felino: cepillado, limpieza de arenero, control de la hidratacion.";
    }
    

    public String toString() {
        return "Datos del Felino" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + " kg" + "\n" +
                "Especie: " + especie + "\n" +
                "Recomendaciones de " + cuidadosRecomendacion() + "\n";
    }

    
}
