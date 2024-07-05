package CUATRIMESTRE_2.POO.Parcial_2_conCantCopias;

public class Main {
    public static void main(String[] args){
        
        // Autor
        Autor brandon = new Autor("Brandon Sanderson", "Estados Unidos", "15-06-1975");
        Autor shakespeare = new Autor("William Shakespeare", "Reino Unido", "26-04-1564");
        Autor rothfuss = new Autor("Patrick Rothfuss", "Estados Unidos", "06-06-1973");
        
        // Lectores
        Lector lec1 = new Lector(1,"franco", 0);
        Lector lec2 = new Lector(2,"Matias", 0);
        Lector lec3 = new Lector(3,"Marta", 0);

        // Libros
        Libro lib1 = new Libro(1, "Mistborn", "Aventura", "Planeta", 2012, brandon, 5);
        Libro lib2 = new Libro(2, "Harry Potter y la piedra filosofal", "Fantasía", "Salamandra", 1997, brandon, 7);
        Libro lib3 = new Libro(3, "Romeo y Julieta", "Drama", "Anaya", 1597, shakespeare, 3);
        Libro lib4 = new Libro(4, "El nombre del viento", "Fantasía épica", "Gigamesh", 2007, rothfuss, 1);

        // Copias
        Copia cop1 = new Copia(1, "en la biblioteca", lib1);
        Copia cop2 = new Copia(1, "en la biblioteca", lib1);
        Copia cop4 = new Copia(3, "en la biblioteca", lib3);
        Copia cop3 = new Copia(4, "en la biblioteca", lib4);

        //----------------------------------------------------------------//

        lec1.realizarPrestamo(cop1);
        lec1.realizarPrestamo(cop1);
        lec1.realizarPrestamo(cop1); 
        cop1.getCantidadCopias();

    }
}
