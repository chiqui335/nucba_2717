package CUATRIMESTRE_2.POO.Parcial_2_conArrays;

import java.util.ArrayList;
import java.util.List;


public class Lector {
    private int id;
    private String nombre;
    private int numLibrosPrestados;
    private List<Copia> copiasPrestadas;

    // Constructor predeterminado
    public Lector() {
        this.id = 0;
        this.nombre = "Desconocido";
        this.numLibrosPrestados = 0;
        this.copiasPrestadas = new ArrayList<>();
    }

    // Constructor con parametros
    public Lector(int id, String nombre, int numLibrosPrestados) {
        this.id = id;
        this.nombre = nombre;
        this.numLibrosPrestados = numLibrosPrestados;
        this.copiasPrestadas = new ArrayList<>();
    }


    // Getter Para copiasPrestadas
    public List<Copia> getCopiasPrestadas() {
        return copiasPrestadas;
    }

    // Getter para id
    public int getId() {
        return id;
    }

    // Setter para id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para numLibrosPrestados
    public int getNumLibrosPrestados() {
        return numLibrosPrestados;
    }

    // Setter para numLibrosPrestados
    public void setNumLibrosPrestados(int numLibrosPrestados) {
        this.numLibrosPrestados = numLibrosPrestados;
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
                copiasPrestadas.add(copia);
                System.out.println("El libro " + copia.getLibro().getNombre() + " fue prestado con ÉXITO");
                copia.setEstado("prestado");
                setNumLibrosPrestados(getNumLibrosPrestados() + 1);
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
            if (!copiasPrestadas.contains(copia)) {
                System.out.println("El lector no posee la copia de " + copia.getLibro().getNombre());
            } else {
                    // Verificar el estado actual de la copia
                if (copia.getEstado().equals("en la biblioteca")) {
                    System.out.println("El lector no posee o ya ha devuelto el libro " + copia.getLibro().getNombre());
                } else {
                    // Se realiza la devolucion
                    System.out.println("El libro " + copia.getLibro().getNombre() + " fue devuelto con éxito");
                    copia.setEstado("en la biblioteca");
                    copiasPrestadas.remove(copia);
                    setNumLibrosPrestados(getNumLibrosPrestados() - 1);
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
    public void mostrarCopiasPrestadas(){
        System.out.println("Libros prestados a " + nombre + ":");
        for (Copia copia : copiasPrestadas){
            System.out.println(copia.getLibro().toString());
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
