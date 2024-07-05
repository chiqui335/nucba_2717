package CUATRIMESTRE_2.POO.parcial_chat;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String nombre;
    private List<Copia> copiasPrestadas;

    // Constructor
    public Lector(String nombre) {
        this.nombre = nombre;
        this.copiasPrestadas = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Copia> getCopiasPrestadas() {
        return copiasPrestadas;
    }

    // Métodos para manejar préstamos
    public boolean prestarCopia(Copia copia) {
        if (copiasPrestadas.size() >= 3 || copia.isPrestada()) {
            return false;
        }
        copiasPrestadas.add(copia);
        copia.setPrestada(true);
        return true;
    }

    public boolean devolverCopia(Copia copia) {
        if (copiasPrestadas.remove(copia)) {
            copia.setPrestada(false);
            return true;
        }
        return false;
    }

    // Sobrescritura del método toString()
    @Override
    public String toString() {
        return "Lector [nombre=" + nombre + ", copiasPrestadas=" + copiasPrestadas + "]";
    }
}

