package CUATRIMESTRE_2.POO.Parcial_2_conArrays;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    // Variables primitivas
    private int id; // Declaración de variable primitiva
    private String nombre; // Declaración de variable de referencia (String)
    private int numLibrosPrestados; // Declaración de variable primitiva
    private List<Copia> copiasPrestadas; // Declaración de variable de referencia (List<Copia>)

    // Constructor predeterminado
    public Lector() {
        this.id = 0;
        this.nombre = "Desconocido";
        this.numLibrosPrestados = 0;
        this.copiasPrestadas = new ArrayList<>(); // Inicialización de variable de referencia
    }

    // Constructor con parametros
    public Lector(int id, String nombre, int numLibrosPrestados) {
        this.id = id;
        this.nombre = nombre;
        this.numLibrosPrestados = numLibrosPrestados;
        this.copiasPrestadas = new ArrayList<>(); // Inicialización de variable de referencia
    }

    // Getter para copiasPrestadas
    public List<Copia> getCopiasPrestadas() {
        return copiasPrestadas; // Uso de variable de referencia
    }

    // Getter para id
    public int getId() {
        return id; // Uso de variable primitiva
    }

    // Setter para id
    public void setId(int id) {
        this.id = id; // Uso de variable primitiva
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Uso de variable de referencia
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre; // Uso de variable de referencia
    }

    // Getter para numLibrosPrestados
    public int getNumLibrosPrestados() {
        return numLibrosPrestados; // Uso de variable primitiva
    }

    // Setter para numLibrosPrestados
    public void setNumLibrosPrestados(int numLibrosPrestados) {
        this.numLibrosPrestados = numLibrosPrestados; // Uso de variable primitiva
    }

    // Metodo para realizar un prestamo de una copia
    public void realizarPrestamo(Copia copia) {
        if (copiasPrestadas.size() >= 3) {
            System.out.println("El lector ya tiene 3 libros prestados.");
        } else {
            // Verificar el estado actual de la copia
            if (!copia.getEstado().equals("en la biblioteca")) {
                System.out.println("El libro " + copia.getLibro().getNombre() + " ya ha sido prestado");
            } else {
                // Realizar el préstamo
                copiasPrestadas.add(copia); // Uso de variable de referencia
                System.out.println("El libro " + copia.getLibro().getNombre() + " fue prestado con ÉXITO");
                copia.setEstado("prestado");
                setNumLibrosPrestados(getNumLibrosPrestados() + 1); // Uso de variable primitiva
            }
        }
    }

    // Sobrecarga para prestar 2 copias
    public void realizarPrestamo(Copia copia1, Copia copia2) {
        realizarPrestamo(copia1);
        realizarPrestamo(copia2);
    }

    // Sobrecarga para prestar 3 copias
    public void realizarPrestamo(Copia copia1, Copia copia2, Copia copia3) {
        realizarPrestamo(copia1);
        realizarPrestamo(copia2);
        realizarPrestamo(copia3);
    }

    // Metodo para devolver una copia
    public void devolverLibro(Copia copia) {
        if (copiasPrestadas.isEmpty()) {
            System.out.println("El lector no posee libros para devolver");
        } else { // Verificar si la copia esta en la lista del lector
            if (!copiasPrestadas.contains(copia)) { // Uso de variable de referencia
                System.out.println("El lector no posee la copia de " + copia.getLibro().getNombre());
            } else {
                // Verificar el estado actual de la copia
                if (copia.getEstado().equals("en la biblioteca")) {
                    System.out.println("El lector no posee o ya ha devuelto el libro " + copia.getLibro().getNombre());
                } else {
                    // Se realiza la devolucion
                    System.out.println("El libro " + copia.getLibro().getNombre() + " fue devuelto con éxito");
                    copia.setEstado("en la biblioteca");
                    copiasPrestadas.remove(copia); // Uso de variable de referencia
                    setNumLibrosPrestados(getNumLibrosPrestados() - 1); // Uso de variable primitiva
                }
            }
        }
    }

    // Sobrecarga para devolver dos copias
    public void devolverLibro(Copia copia1, Copia copia2) {
        devolverLibro(copia1);
        devolverLibro(copia2);
    }

    // Sobrecarga para devolver tres copias
    public void devolverLibro(Copia copia1, Copia copia2, Copia copia3) {
        devolverLibro(copia1);
        devolverLibro(copia2);
        devolverLibro(copia3);
    }

    // Metodo para mostrar la informacion de los libros que tiene el lector
    public void mostrarCopiasPrestadas() {
        System.out.println("Libros prestados a " + nombre + ":");
        for (Copia copia : copiasPrestadas) { // Uso de variable de referencia
            System.out.println(copia.getLibro().toString()); // Uso de variable de referencia
        }
    }

    public void mostrarInfoLector() {
        System.out.println(this.toString());
        mostrarCopiasPrestadas();
    }

    public String toString() {
        return "Datos Lector: " + '\n' +
                "id= " + id + '\n' +
                "nombre= " + nombre + '\n' +
                "Numero de libros en posesion= " + numLibrosPrestados;
    }
}