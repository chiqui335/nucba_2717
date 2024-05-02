package CUATRIMESTRE_2.POO.Parcial_1;

public class Asignatura {
    private String nombreAsignatura;
    private String codigo;
    private int semestre;

    // setters

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String toString() {
        return "\nNombre de la asignatura: " + nombreAsignatura +
                "\nCodigo de la asignatura: " + codigo +
                "\nSemestre N°: " + semestre;
    }
}
