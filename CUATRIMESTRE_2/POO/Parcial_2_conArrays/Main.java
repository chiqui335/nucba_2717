package CUATRIMESTRE_2.POO.Parcial_2_conArrays;


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

        // Lectores
        Lector lec1 = new Lector(1,"Franco", 0);
        Lector lec2 = new Lector(2,"Matias", 0);
        Lector lec3 = new Lector(3,"Marta", 0);
        Lector lec4 = new Lector(4,"José", 0);

        //----------------------------------------------------------------//

        // Acciones Lector 1
        System.out.println("Prestamos del lector 1"+ '\n');
        lec1.realizarPrestamo(cop1, cop2, cop3);
        lec1.realizarPrestamo(cop4);    // lector 1 ya tiene 3 libros prestados

        System.out.println('\n'+"------------------------------------"+ '\n');
        
        System.out.println("Devoluciones del lector 1");
        lec1.devolverLibro(cop3);        // devolucion con exito
        lec1.devolverLibro(cop4, cop1); // lector 1 no tiene cop4 pero si cop1

        System.out.println('\n'+"------------------------------------"+ '\n');

        System.out.println("Copias en posesion del lector 1"+ '\n');
        lec1.mostrarCopiasPrestadas();

        System.out.println('\n'+"-----------------Fin lector 1-------------------"+ '\n');

        // Acciones Lector 2
        System.out.println("Prestamos del lector 2"+ '\n');
        lec2.realizarPrestamo(cop4, cop5);
        lec2.realizarPrestamo(cop2);    // cop2 ya ha sido prestado
        lec2.realizarPrestamo(cop6);
        lec2.realizarPrestamo(cop3);    // el lector ya tiene 3 libros

        System.out.println('\n'+"------------------------------------"+ '\n');

        System.out.println("Devoluciones del lector 2"+ '\n');
        lec2.devolverLibro(cop2);  
        lec2.devolverLibro(cop1);   // cop3 no estas en posesion del lector
        lec2.devolverLibro(cop3);   

        lec2.devolverLibro(cop6, cop1, cop3);   // cop6 se devuelve con exito. cop1, cop3 no estan en posesion del lector 3


        System.out.println('\n'+"------------------------------------"+ '\n');

        System.out.println("Copias en posesion del lector 2"+ '\n');
        lec2.mostrarCopiasPrestadas();

        System.out.println('\n'+"-----------------Fin lector 2-------------------"+ '\n');

        // Acciones Lector 3
        System.out.println("Prestamos del lector 3"+ '\n');
        lec3.realizarPrestamo(cop6, cop1);
        lec3.realizarPrestamo(cop2);
        lec2.realizarPrestamo(cop6);
        lec2.realizarPrestamo(cop1);

        System.out.println('\n'+"------------------------------------"+ '\n');

        System.out.println("Devoluciones del lector 3" + '\n');
        lec3.devolverLibro(cop1);
        lec3.devolverLibro(cop2);       // cop3, cop4, cop3 no estan en posesion del lector 3
        lec3.devolverLibro(cop4);
        lec3.devolverLibro(cop3);
        lec3.devolverLibro(cop6, cop1); // devuelve cop6 pero cuando intenta devolver cop1 el output es "El lector no posee libros para devolver"

        System.out.println('\n'+"------------------------------------"+ '\n');

        System.out.println("Copias en posesion del lector 3" + '\n');
        lec3.mostrarCopiasPrestadas();

        System.out.println('\n'+"-----------------Fin lector 3-------------------"+ '\n');

        // Acciones Lector 4
        System.out.println("Prestamos del lector 4" + '\n');
        lec4.realizarPrestamo(cop1, cop3, cop6);
        lec4.realizarPrestamo(cop4, cop2, cop5);

        System.out.println("Devoluciones del lector 4" + '\n');
        lec4.devolverLibro(cop1, cop3);
        lec4.devolverLibro(cop2, cop6, cop5);

        System.out.println("Copias en posesion del lector 4" + '\n');
        lec4.mostrarCopiasPrestadas();

        System.out.println('\n'+"-----------------Fin lector 4-------------------"+ '\n');

        
        System.out.println('\n'+"Datos de los lectores: " );
        System.out.println("Lector 1: "+ '\n');
        lec1.mostrarInfoLector();
        System.out.println("Lector 2: " + '\n');
        lec2.mostrarInfoLector();
        System.out.println("Lector 3: "+ '\n');
        lec3.mostrarInfoLector();
        System.out.println("Lector 4: "+ '\n');
        lec4.mostrarInfoLector();


        System.out.println('\n'+"Datos de las copias: "+ '\n');
        cop1.mostrarDatosCopia();
        cop2.mostrarDatosCopia();
        cop3.mostrarDatosCopia();
        cop4.mostrarDatosCopia();
        cop5.mostrarDatosCopia();
        cop6.mostrarDatosCopia();

        System.out.println('\n'+"Estado de las copias: "+ '\n');
        cop1.mostrarEstadoCopia();
        cop2.mostrarEstadoCopia();
        cop3.mostrarEstadoCopia();
        cop4.mostrarEstadoCopia();
        cop5.mostrarEstadoCopia();
        cop6.mostrarEstadoCopia();


    }
}
