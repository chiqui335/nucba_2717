package CUATRIMESTRE_2.POO.Parcial_2_conArraysSimples;

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

    // public void realizarPrestamo(Copia copia) {
    //     if (getNumLibrosPrestados() >= 3) {
    //         System.out.println("El lector ya tiene 3 libros prestados.");
    //     } else {
    //         // Verificar el estado actual de la copia
    //         if (copia.getEstado().equals("prestado")) {
    //             System.out.println("El libro " + copia.getLibro().getNombre() + " ya ha sido prestado");
    //         } else if (!copia.getEstado().equals("en la biblioteca")) {
    //             System.out.println("El libro " + copia.getLibro().getNombre() + " no está disponible para préstamo");
    //         } else {
    //             // Realizar el préstamo
    //             setNumLibrosPrestados(getNumLibrosPrestados() + 1);
    //             System.out.println("El libro " + copia.getLibro().getNombre() + " fue prestado con éxito");
    //             copia.setEstado("prestado");
    //             copiasPrestadas.add(copia);
    //         }
    //     }
    // }


    public void realizarPrestamo(Copia copia) {
        if (copiasPrestadas.size() >= 3) {
            System.out.println("El lector ya tiene 3 libros prestados.");
        } else {
            // Verificar el estado actual de la copia
            if (copia.getEstado().equals("prestado")) {
                System.out.println("El libro " + copia.getLibro().getNombre() + " ya ha sido prestado");
            } else if (!copia.getEstado().equals("en la biblioteca")) {
                System.out.println("El libro " + copia.getLibro().getNombre() + " no está disponible para préstamo");
            } else {
                // Realizar el préstamo
                copiasPrestadas.add(copia);
                System.out.println("El libro " + copia.getLibro().getNombre() + " fue prestado con éxito");
                copia.setEstado("prestado");
                setNumLibrosPrestados(getNumLibrosPrestados() + 1);
            }
        }
    }
       
    
    





    // public void realizarPrestamo(Copia copia) {
    //     if (getNumLibrosPrestados() >= 3) {
    //         System.out.println("El lector ya tiene 3 libros prestados.");
    //     } else {
    //         if (copia.getEstado() != "en la biblioteca"){
    //             System.out.println("El libro " + copia.getLibro().getNombre() + " ya ha sido prestado");
 
    //         } else {
    //             setNumLibrosPrestados(getNumLibrosPrestados() + 1);
    //             System.out.println("El libro " + copia.getLibro().getNombre() + " fue prestado con éxito");
    //             copia.setEstado("prestado");
    //             copiasPrestadas.add(copia);
    //         }
    //     }
    // }

    // Sobrecarga para prestar mas de una copia



    // Metodo para realizar una devolucion de una copia
    // public void devolverLibro(Copia copia) {
    //     if (getNumLibrosPrestados() == 0) {
    //         System.out.println("El lector no posee libros para devolver");
    //     } else {
    //         if (copia.getEstado().equals("en la biblioteca")) {
    //             System.out.println("El lector no posee o ya ha devuelto el libro " + copia.getLibro().getNombre());
    //         } else {
    //             setNumLibrosPrestados(getNumLibrosPrestados() - 1);
    //             System.out.println("El libro " + copia.getLibro().getNombre() + " fue devuelto con éxito");
    //             copia.setEstado("en la biblioteca");
    //             copiasPrestadas.remove(copia);
    //         }
    //     }
    // }


    public void devolverLibro(Copia copia) {
        if (copiasPrestadas.isEmpty()) {
            System.out.println("El lector no posee libros para devolver");
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
    

    // Sobrecarga para devolver mas de una copia



    // Metodo para mostrar la informacion de los libros que tiene el lector
    public void mostrarCopiasPrestadas(){
        System.out.println("Libros prestados a " + nombre + ":");
        for (Copia copia : copiasPrestadas){
            System.out.println(copia.getLibro().toString());
        }
    }


    public String toString() {
        return "Datos Lector: " + '\n' +
                "id= " + id + '\n' +
                "nombre= " + nombre + '\n' +
                "Numero de libros prestados= " + numLibrosPrestados;
    }     
}
