package CUATRIMESTRE_2.POO.Parcial_1;

public class Departamento {
    private String nombreDepartamento;
    private int idDepartamento;
    private Profesor profesor;

    // setters

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public void setId(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String toString() {
        return "\nNombre del departamento: " + nombreDepartamento +
                "\nId del departamento: " + idDepartamento +
                "\nDatos del Profesor: " + profesor;
    }
}