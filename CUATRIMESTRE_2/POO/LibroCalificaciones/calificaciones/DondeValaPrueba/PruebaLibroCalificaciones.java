package CUATRIMESTRE_2.POO.LibroCalificaciones.calificaciones.DondeValaPrueba;

import CUATRIMESTRE_2.POO.LibroCalificaciones.calificaciones.DondeValaClase.LibroCalificaciones;

public class PruebaLibroCalificaciones {

    public static void main(String[] args) {

        // se crea el [objeto?] p1 usando la clase librocalificaciones
        LibroCalificaciones p1 = new LibroCalificaciones(); // reservo el espacio en memoria
        LibroCalificaciones p2 = new LibroCalificaciones();
        LibroCalificaciones p3 = new LibroCalificaciones();

        // le cargo el valor a la variable tipo string (escrito en la class)
        p1.nombreCurso = "EL MEJOR";
        p1.showNombreCurso();

        p2.nombreCurso = "EL 2DO MEJOR";
        p2.showNombreCurso();

        p3.nombreCurso = "EL 3ER MEJOR";
        p3.showNombreCurso();

        // System.out.println(p1); si pongo esto me va a salir en la consola:
        // CUATRIMESTRE_2.POO.LibroCalificaciones.calificaciones.DondeValaClase.LibroCalificaciones@372f7a8d
        // asi que no va. el p1.shownombrecurso() ya hace print
    }
}
