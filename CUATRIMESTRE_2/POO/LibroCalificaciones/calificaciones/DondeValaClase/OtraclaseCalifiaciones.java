package CUATRIMESTRE_2.POO.LibroCalificaciones.calificaciones.DondeValaClase;

public class OtraclaseCalifiaciones {
    public static void main(String[] args) {
        Librocalificaciones lc1 = new Librocalificaciones();

        lc1.calificaciones("POO");

        System.out.println(lc1.getNombreCurso());
    }
}
