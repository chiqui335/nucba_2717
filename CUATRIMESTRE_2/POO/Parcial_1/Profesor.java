package CUATRIMESTRE_2.POO.Parcial_1;

public class Profesor {
    private String nombreProfesor; // variable de instancia
    private int idProfesor; // variable de instancia
    private Asignatura asignatura; // variable de instancia

    // setters

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor; // Variable local
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor; // Variable local
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura; // Variable local
    }

    // Sobreescritura
    public String toString() {
        return "\nNombre del profesor: " + nombreProfesor +
                "\nId del profesor: " + idProfesor +
                "\nDatos de la asignatura enseñada por el profesor: " + asignatura;
    }
}
