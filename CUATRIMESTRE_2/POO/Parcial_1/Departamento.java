package CUATRIMESTRE_2.POO.Parcial_1;

public class Departamento {
    private String nombreDepartamento; // variable de instancia
    private int idDepartamento; // variable de instancia
    private Profesor profesor; // variable de instancia

    // setters

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento; // Variable local
    }

    public void setId(int idDepartamento) {
        this.idDepartamento = idDepartamento; // Variable local
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor; // Variable local
    }

    // Sobreescritura
    public String toString() {
        return "\nNombre del departamento: " + nombreDepartamento +
                "\nId del departamento: " + idDepartamento +
                "\nDatos del Profesor de la materia: " + profesor;
    }
}