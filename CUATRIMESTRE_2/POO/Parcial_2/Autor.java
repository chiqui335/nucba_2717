package CUATRIMESTRE_2.POO.Parcial_2;


public class Autor {
    private String nombre;
    private String nacionalidad;
    private String fechaNacimiento;

    // Constructor predeterminado
    public Autor() {
        this.nombre = "desconocido";
        this.nacionalidad = "desconocida";
        this.fechaNacimiento = "desconocida";
    }

    // Constructor con parametros
    public Autor(String nombre, String nacionalidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para nacionalidad
    public String getNacionalidad() {
        return nacionalidad;
    }

    // Setter para nacionalidad
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Getter para fechaNacimiento
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Setter para fechaNacimiento
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString() {
        return "Datos Autor: " + '\n' +
                "nombre= " + nombre + '\n' +
                "nacionalidad= " + nacionalidad + '\n' +
                "fechaNacimiento= " + fechaNacimiento;
    }
    


}
