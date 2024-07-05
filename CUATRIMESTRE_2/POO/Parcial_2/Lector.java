package CUATRIMESTRE_2.POO.Parcial_2;

public class Lector {
    private int id;
    private String nombre;
    private int numLibrosPrestados;

    // Constructor predeterminado
    public Lector() {
        this.id = 0;
        this.nombre = "Desconocido";
        this.numLibrosPrestados = 0;
    }

    // Constructor con parametros
    public Lector(int id, String nombre, int numLibrosPrestados) {
        this.id = id;
        this.nombre = nombre;
        this.numLibrosPrestados = numLibrosPrestados;
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


    // public void realizarPrestamo(Lector lector, Copia copia) {
    //     if (lector.getNumLibrosPrestados() >= 3) {
    //         System.out.println("El lector ya tiene 3 libros prestados.");
    //     } else {
    //         if (copia.getEstado() == "prestado"){
    //             System.out.println("El libro " + copia.getLibro().getNombre() + " ya ha sido prestado");
 
    //         } else {
    //             lector.setNumLibrosPrestados(lector.getNumLibrosPrestados() + 1);
    //             System.out.println("El libro " + copia.getLibro().getNombre() + " fue prestado con éxito");
    //             copia.setEstado("prestado");
    //         }
            
    //     }
    // }


    public void realizarPrestamo(Copia copia) {
        if (getNumLibrosPrestados() >= 3) {
            System.out.println("El lector ya tiene 3 libros prestados.");
        } else {
            if (copia.getEstado() != "en la biblioteca"){
                System.out.println("El libro " + copia.getLibro().getNombre() + " ya ha sido prestado");
 
            } else {
                setNumLibrosPrestados(getNumLibrosPrestados() + 1);
                System.out.println("El libro " + copia.getLibro().getNombre() + " fue prestado con éxito");
                copia.setEstado("prestado");
            }
        }
    }
    
    // public void devolverLibro(Lector lector, Copia copia){
    //     if (lector.getNumLibrosPrestados() <= 0){
    //         System.out.println("El lector no posee libros para devolver");
    //     } else {
    //         if(copia.getEstado() == "en la biblioteca"){
    //             System.out.println("El lector no posee o ya ha devuelto el libro " + copia.getLibro().getNombre());
    //         } else {
    //             lector.setNumLibrosPrestados(lector.getNumLibrosPrestados() - 1);
    //             System.out.println("El libro "  + copia.getLibro().getNombre() +  " fue devuelto con éxito");
    //             copia.setEstado("en la biblioteca");
    //         }
    //     } 
    // }

    public void devolverLibro(Copia copia){
        if (getNumLibrosPrestados() <= 0){
            System.out.println("El lector no posee libros para devolver");
        } else {
            if(copia.getEstado() != "en la biblioteca"){
                System.out.println("El lector no posee o ya ha devuelto el libro " + copia.getLibro().getNombre());
            } else {
                setNumLibrosPrestados(getNumLibrosPrestados() - 1);
                System.out.println("El libro "  + copia.getLibro().getNombre() +  " fue devuelto con éxito");
                copia.setEstado("en la biblioteca");
            }
        } 
    }


    public String toString() {
        return "Datos Lector: " + '\n' +
                "id= " + id + '\n' +
                "nombre= " + nombre + '\n' +
                "Numero de libros prestados= " + numLibrosPrestados;
    }
    
        
}
