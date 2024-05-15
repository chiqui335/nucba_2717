package CUATRIMESTRE_2.POO.LibroCalificaciones.calificaciones.DondeValaClase;

public class LibroCalificaciones {
    // se define la variable
    private String nombreCurso; // (variable de instancia)

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso; // -->esta es la variable local
        // esta es la variable de instancia (this.variable es del OBJETO)
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    // muestro la variable de nombreCurso
    public void showNombreCurso() {
        System.out.println("El nombre del curso es: " + nombreCurso);
    }
}
