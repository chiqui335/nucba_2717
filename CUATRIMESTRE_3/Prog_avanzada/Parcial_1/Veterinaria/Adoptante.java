package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.util.Scanner;

public class Adoptante {
    private int id;
    private String nombre;
    private int edad;
    private String direccion;

    public Adoptante(){ 
        this.direccion = null;
        this.edad = 0;
        this.nombre = null;
        this.id = 0;
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

        //se registra los cambios del adoptante
        setId(idAdoptante);
        setDireccion(direccionAdoptante);
        setEdad(edadAdoptante);
        setNombre(nombreAdoptante);

        scAdoptante.close();
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //getters
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
