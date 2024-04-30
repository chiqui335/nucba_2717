package CUATRIMESTRE_2.POO.actividades.Modelo_parcial;

public class Autor {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String sexo;
    private String email;

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nFecha de Nacimiento: " + fechaNacimiento +
                "\nSexo: " + sexo +
                "\nEmail: " + email;
    }
}
