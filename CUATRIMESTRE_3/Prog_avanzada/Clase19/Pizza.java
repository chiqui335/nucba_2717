package CUATRIMESTRE_3.Prog_avanzada.Clase19;

import java.util.List;

public class Pizza {
    private String nombre;
    private List<String> ingredientes;
    private int numeroOrden;
    public Pizza(String nombre, List<String> ingredientes, int numeroOrden) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.numeroOrden = numeroOrden;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<String> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public int getNumeroOrden() {
        return numeroOrden;
    }
    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }
    @Override
    public String toString() {
        return "Pizza [nombre=" + nombre + ", ingredientes=" + ingredientes + ", numeroOrden=" + numeroOrden + "]";
    }

    
}
