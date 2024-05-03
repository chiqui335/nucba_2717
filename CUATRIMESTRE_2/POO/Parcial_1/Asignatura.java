package CUATRIMESTRE_2.POO.Parcial_1;

public class Asignatura {
    private String nombreAsignatura; // variable de instancia
    private String codigo; // variable de instancia
    private int semestre; // variable de instancia

    // setters

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura; // variable local
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo; // variable local
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre; // variable local
    }

    // Sobreescritura
    public String toString() {
        return "\nNombre de la asignatura: " + nombreAsignatura +
                "\nCodigo de la asignatura: " + codigo +
                "\nSemestre N°: " + semestre;
    }
}
