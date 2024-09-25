package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;

public class Canino extends Mascota  {


    public Canino(){
        //llamar al constructor padre
        super();
    }
    public Canino(String nombre, LocalDate fechaNacimiento, double peso, String especie) {
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



    public void cuidadosRecomendacion() {
        System.out.println("Cuidados del canino: paseos diarios, alimentación balanceada, control de garrapatas.");
    }
    
    @Override
    public String toString() {
        return "Datos de la Mascota" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + "\n" +
                "Especie: " + especie + "\n" +
                "Recomendaciones de Cuidado: "  + "\n";
    }
}
