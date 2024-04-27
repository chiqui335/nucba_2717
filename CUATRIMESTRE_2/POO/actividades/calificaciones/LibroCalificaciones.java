package CUATRIMESTRE_2.POO.actividades.calificaciones;

public class LibroCalificaciones {
    private String nombreCurso;

    public void ShownombreCurso() {
        System.out.println("Nombre del curso: " + nombreCurso);
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

}
