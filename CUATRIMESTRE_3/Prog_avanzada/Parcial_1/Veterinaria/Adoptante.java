package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;


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

    @Override
    public String toString() {
        return "Datos del Adoptante" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Direccion:" + direccion + "\n";
    }
}
