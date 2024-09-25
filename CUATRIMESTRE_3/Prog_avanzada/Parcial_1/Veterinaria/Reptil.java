package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;

public class Reptil extends Mascota {


    public Reptil(){
        super();
    }

    public Reptil(String nombre, LocalDate fechaNacimiento, double peso, String especie) {
        super(nombre, fechaNacimiento, peso, especie);
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

    
    public String cuidadosRecomendacion() {
        return "Cuidados del Reptil: luz solar abundante, temperatura calida, preparacion de un terrario adecuado.";
    }
    

    public String toString() {
        return "Datos del Reptil" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + "\n" +
                "Especie: " + especie + "\n" +
                "Recomendaciones de " + cuidadosRecomendacion() + "\n";
    }

}
