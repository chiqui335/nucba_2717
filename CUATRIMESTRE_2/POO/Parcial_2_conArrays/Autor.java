package CUATRIMESTRE_2.POO.Parcial_2_conArrays;

public class Autor {
    // Declaración de variables de referencia
    private String nombre; 
    private String nacionalidad;
    private String fechaNacimiento;

    // Constructor predeterminado
    public Autor() {
        // Asignación de valores a variables de referencia
        this.nombre = "desconocido";
        this.nacionalidad = "desconocida";
        this.fechaNacimiento = "desconocida";
    }

    // Constructor con parámetros
    public Autor(String nombre, String nacionalidad, String fechaNacimiento) {
        // Asignación de valores a variables de referencia
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorno de variable de referencia
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asignación a variable de referencia
    }

    // Getter para nacionalidad
    public String getNacionalidad() {
        return nacionalidad; // Retorno de variable de referencia
    }

    // Setter para nacionalidad
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad; // Asignación a variable de referencia
    }

    // Getter para fechaNacimiento
    public String getFechaNacimiento() {
        return fechaNacimiento; // Retorno de variable de referencia
    }

    // Setter para fechaNacimiento
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento; // Asignación a variable de referencia
    }

    public String toString() {
        // Uso de variables de referencia en la construcción del String
        return "Datos Autor: " + '\n' +
                "nombre= " + nombre + '\n' +
                "nacionalidad= " + nacionalidad + '\n' +
                "fechaNacimiento= " + fechaNacimiento;
    }
}