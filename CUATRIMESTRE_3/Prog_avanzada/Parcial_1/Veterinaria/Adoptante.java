package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.util.Scanner;

public class Adoptante {
    protected int id;
    protected String nombre;
    protected int edad;
    protected String direccion;

    public Adoptante(){
        
    }

    public Adoptante(String nombre, int edad, String direccion, int id) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void datosAdoptante(){

        Scanner scAdoptante = new Scanner(System.in);

        //se piden los datos del adoptante
        System.out.println("Ingrese los datos del adoptante:");
        System.out.print("Nombre: ");
        String nombreAdoptante = scAdoptante.nextLine();

        System.out.print("Edad: ");
        int edadAdoptante = scAdoptante.nextInt();
        scAdoptante.nextLine();

        System.out.print("Dirección: ");
        String direccionAdoptante = scAdoptante.nextLine();

        System.out.println("ID:");
        int idAdoptante = scAdoptante.nextInt();
        scAdoptante.nextLine();

        //se registra el adoptante
        Adoptante adoptante = new Adoptante(nombreAdoptante, edadAdoptante, direccionAdoptante, idAdoptante); 
        
        scAdoptante.close();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String toString() {
        return "Adoptante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
