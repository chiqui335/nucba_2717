package CUATRIMESTRE_2.POO.actividades.calificaciones;

public class PruebaLibroCalificaciones {
    public static void main(String[] args) {

        LibroCalificaciones p1 = new LibroCalificaciones(); // esto es un objeto

        // p1.ShownombreCurso();

        p1.setNombreCurso("curso 1"); // le cambio el valor a la variable nombreCurso

        p1.getNombreCurso(); // llamo al metodo de la otra clase para que me traiga la variable (?)

        System.out.println(p1.getNombreCurso()); // imprimo
    }
}
