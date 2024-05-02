package CUATRIMESTRE_2.POO.Parcial_1;

public class Profesor {
    private String nombreProfesor;
    private int idProfesor;
    private Asignatura asignatura;

    // setters

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public String toString() {
        return "\nNombre del profesor: " + nombreProfesor +
                "\nId del profesor: " + idProfesor +
                "\nDatos de la asignatura: " + asignatura;
    }
}
