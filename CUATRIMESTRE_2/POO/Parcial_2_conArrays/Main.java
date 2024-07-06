package CUATRIMESTRE_2.POO.Parcial_2_conArrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        


        // Autor
        Autor brandon = new Autor("Brandon Sanderson", "Estados Unidos", "15-06-1975");
        Autor shakespeare = new Autor("William Shakespeare", "Reino Unido", "26-04-1564");
        Autor rothfuss = new Autor("Patrick Rothfuss", "Estados Unidos", "06-06-1973");
        Autor garciaMarquez = new Autor("Gabriel García Márquez", "Colombia", "06-03-1927");
        Autor austen = new Autor("Jane Austen", "Reino Unido", "16-12-1775");
        
        // Libros
        Libro lib1 = new Libro(1, "Mistborn", "Aventura", "Planeta", 2012, brandon);
        Libro lib2 = new Libro(2, "Harry Potter y la piedra filosofal", "Fantasía", "Salamandra", 1997, brandon);
        Libro lib3 = new Libro(3, "Romeo y Julieta", "Drama", "Anaya", 1597, shakespeare);
        Libro lib4 = new Libro(4, "El nombre del viento", "Fantasía épica", "Gigamesh", 2007, rothfuss);
        Libro lib5 = new Libro(6, "Cien años de soledad", "Realismo mágico", "Diana", 1967, garciaMarquez);
        Libro lib6 = new Libro(7, "Orgullo y prejuicio", "Novela romántica", "Penguin Classics", 1813, austen);

        // Copias
        Copia cop1 = new Copia(1, "en la biblioteca", lib1);
        Copia cop2 = new Copia(2, "en la biblioteca", lib2);
        Copia cop3 = new Copia(3, "en la biblioteca", lib3);
        Copia cop4 = new Copia(4, "en la biblioteca", lib4);
        Copia cop5 = new Copia(5, "en la biblioteca", lib5);
        Copia cop6 = new Copia(6, "en la biblioteca", lib6);
        // Copia cop7 = new Copia(7, "en la biblioteca", lib4);
        // Copia cop8 = new Copia(8, "en la biblioteca", lib5);
        // Copia cop9 = new Copia(9, "en la biblioteca", lib6);

        // Lectores
        Lector lec1 = new Lector(1,"Franco", 0);
        Lector lec2 = new Lector(2,"Matias", 0);
        Lector lec3 = new Lector(3,"Marta", 0);

        //----------------------------------------------------------------//

        // Acciones Lector 1
        System.out.println("Prestamos del lector 1");
        lec1.realizarPrestamo(cop1);
        lec1.realizarPrestamo(cop2);
        lec1.realizarPrestamo(cop3);
        lec1.realizarPrestamo(cop3);

        System.out.println("------------------------------------");
        
        System.out.println("Devoluciones del lector 1");
        lec1.devolverLibro(cop3);

        System.out.println("------------------------------------");

        System.out.println("Copias en posesion del lector 1");
        lec1.mostrarCopiasPrestadas();

        System.out.println("-----------------Fin lector 1-------------------");

        // Acciones Lector 2
        System.out.println("Prestamos del lector 2");
        lec2.realizarPrestamo(cop4);
        lec2.realizarPrestamo(cop4);
        lec2.realizarPrestamo(cop5);
        lec2.realizarPrestamo(cop6);

        System.out.println("------------------------------------");

        System.out.println("Devoluciones del lector 2");
        lec2.devolverLibro(cop6);
        lec2.devolverLibro(cop2);
        lec2.devolverLibro(cop1);
        lec2.devolverLibro(cop3);


        System.out.println("------------------------------------");

        System.out.println("Copias en posesion del lector 2");
        lec2.mostrarCopiasPrestadas();

        System.out.println("-----------------Fin lector 2-------------------");

        // Acciones Lector 3
        System.out.println("Prestamos del lector 3");
        lec3.realizarPrestamo(cop6);
        lec3.realizarPrestamo(cop2);
        lec3.realizarPrestamo(cop1);
        lec2.realizarPrestamo(cop6);
        lec2.realizarPrestamo(cop1);


        System.out.println("------------------------------------");

        System.out.println("Devoluciones del lector 3");
        lec3.devolverLibro(cop1);
        lec3.devolverLibro(cop2);
        lec3.devolverLibro(cop4);
        lec3.devolverLibro(cop3);
        lec3.devolverLibro(cop1);

        System.out.println("------------------------------------");




        System.out.println("Copias en posesion del lector 3");
        lec3.mostrarCopiasPrestadas();

    }
}
