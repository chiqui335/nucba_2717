package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;
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

    
    public void datosEspeficicos(Scanner scM) {
        System.out.println("Tipo: ");
        String Tipo = scM.nextLine();
        this.setTipo(Tipo);
    }
    
    public void cuidadosRecomendacion() {
        System.out.println("Cuidados del Reptil: Iluminacion natural, variedad en la dieta, temperatura cálida.");
    }

    public String toString(){
        return "Nombre: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Peso: " + peso + ", Raza: " + tipo;
    }
}
