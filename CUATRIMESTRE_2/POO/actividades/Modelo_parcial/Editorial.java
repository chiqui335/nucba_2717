package CUATRIMESTRE_2.POO.actividades.Modelo_parcial;

public class Editorial {
    private String nombre;
    private String telefono;
    private String direccion;
    private String localidad;
    private String email;
    private String cuit;

    // Setter y Getter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Setter y Getter para telefono
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setter y Getter para direccion
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    // Setter y Getter para localidad
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    // Setter y Getter para email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Setter y Getter para cuit
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCuit() {
        return cuit;
    }

    // hacer el public String toString()
    public String toString() {
        return "Nombre: " + nombre +
                "\nTeléfono: " + telefono +
                "\nDirección: " + direccion +
                "\nLocalidad: " + localidad +
                "\nEmail: " + email +
                "\nCUIT: " + cuit;
    }
}
