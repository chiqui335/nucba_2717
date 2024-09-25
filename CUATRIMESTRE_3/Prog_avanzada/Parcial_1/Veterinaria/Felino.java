package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
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

    @Override
    public void datosEspeficicos(Scanner scM) {
        System.out.println("Raza: ");
        String raza = scM.nextLine();
        this.setRaza(raza);
    }

    public void cuidadosRecomendacion() {
        System.out.println("Cuidados del felino: cepillado, limpieza de arenero, control de la hidratacion.");
    }

    public String toString(){
        return "Nombre: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Peso: " + peso + ", Raza: " + raza;
    }

    
}
