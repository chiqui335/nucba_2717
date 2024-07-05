package CUATRIMESTRE_2.POO.parcial_chat;

public class Copia {
    private int id;
    private Libro libro;
    private boolean prestada;

    // Constructor
    public Copia(int id, Libro libro) {
        this.id = id;
        this.libro = libro;
        this.prestada = false; // Por defecto, la copia no está prestada
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public boolean isPrestada() {
        return prestada;
    }

    public void setPrestada(boolean prestada) {
        this.prestada = prestada;
    }

    // Sobrescritura del método toString()
    @Override
    public String toString() {
        return "Copia [id=" + id + ", libro=" + libro + ", prestada=" + prestada + "]";
    }
}
