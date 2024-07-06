package CUATRIMESTRE_2.POO.parcial_chat;

public class Main {
    public static void main(String[] args) {
        // Creación de autores
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano", "6 de marzo de 1927");
        Autor autor2 = new Autor("Mario Vargas Llosa", "Peruano", "28 de marzo de 1936");

        // Creación de libros
        Libro libro1 = new Libro("Cien años de soledad", "Novela", "Sudamericana", 1967, autor1);
        Libro libro2 = new Libro("La ciudad y los perros", "Novela", "Seix Barral", 1963, autor2);

        // Creación de copias
        Copia copia1 = new Copia(1, libro1);
        Copia copia2 = new Copia(2, libro2);
        Copia copia3 = new Copia(1, libro1);
        Copia copia4 = new Copia(2, libro2);
        Copia copia5 = new Copia(1, libro1);
        Copia copia6 = new Copia(2, libro2);
        Copia copia7 = new Copia(1, libro1);
        Copia copia8 = new Copia(2, libro2);

        // Creación de un lector
        Lector lector1 = new Lector("Juan Pérez");

        // Prueba de préstamo
        System.out.println("Intentando prestar copias:");
        boolean prestamo1 = lector1.prestarCopia(copia1);
        boolean prestamo2 = lector1.prestarCopia(copia2);
        boolean prestamo3 = lector1.prestarCopia(copia2); // Intentando prestar la misma copia dos veces
        boolean prestamo4 = lector1.prestarCopia(copia3);
        boolean prestamo5 = lector1.prestarCopia(copia4);
        boolean prestamo6 = lector1.prestarCopia(copia5);
        boolean prestamo7 = lector1.prestarCopia(copia6);
        boolean prestamo8 = lector1.prestarCopia(copia7);
        boolean prestamo9 = lector1.prestarCopia(copia8);


        if (prestamo1) {
            System.out.println("Copia 1 prestada a " + lector1.getNombre());
        } else {
            System.out.println("No se pudo prestar Copia 1 a " + lector1.getNombre());
        }

        if (prestamo2) {
            System.out.println("Copia 2 prestada a " + lector1.getNombre());
        } else {
            System.out.println("No se pudo prestar Copia 2 a " + lector1.getNombre());
        }

        if (!prestamo3) {
            System.out.println("No se pudo prestar nuevamente Copia 2 a " + lector1.getNombre());
        }

        // Mostrar información de las copias prestadas al lector
        System.out.println("Libros prestados a " + lector1.getNombre() + ":");
        for (Copia copia : lector1.getCopiasPrestadas()) {
            System.out.println(copia.getLibro());
        }

        // Devolución de una copia
        boolean devolucion = lector1.devolverCopia(copia1);
        if (devolucion) {
            System.out.println("Copia 1 devuelta por " + lector1.getNombre());
        } else {
            System.out.println("No se pudo devolver Copia 1 por " + lector1.getNombre());
        }

        // Mostrar información de las copias prestadas actualizadas
        System.out.println("Libros prestados a " + lector1.getNombre() + ":");
        for (Copia copia : lector1.getCopiasPrestadas()) {
            System.out.println(copia.getLibro());
        }
    }
}
