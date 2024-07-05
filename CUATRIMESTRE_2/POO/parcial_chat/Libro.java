package CUATRIMESTRE_2.POO.parcial_chat;

public class Libro {
    private String nombre;
    private String tipo;
    private String editorial;
    private int año;
    private Autor autor;

    // Constructor
    public Libro(String nombre, String tipo, String editorial, int año, Autor autor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.año = año;
        this.autor = autor;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Sobrescritura del método toString()
    @Override
    public String toString() {
        return "Libro [nombre=" + nombre + ", tipo=" + tipo + ", editorial=" + editorial + ", año=" + año + ", autor=" + autor + "]";
    }
}
