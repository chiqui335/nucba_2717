package CUATRIMESTRE_2.POO.Parcial_2_conArrays;

public class Libro {
    // Variables primitivas
    private int id; // Declaración de variable primitiva
    private String nombre; // Declaración de variable de referencia 
    private String tipo; // Declaración de variable de referencia 
    private String editorial; // Declaración de variable de referencia 
    private int año; // Declaración de variable primitiva
    private Autor autor; // Declaración de variable de referencia 

    // Constructor predeterminado
    public Libro() {
        this.id = 0;
        this.nombre = "desconocido";
        this.tipo = "desconocido";
        this.editorial = "desconocida";
        this.año = 0;
        this.autor = null;
    }

    // Constructor con parametros
    public Libro(int id, String nombre, String tipo, String editorial, int año, Autor autor) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.año = año;
        this.autor = autor;
    }

    // Getter para id
    public int getId() {
        return id; // Uso de variable primitiva
    }

    // Setter para id
    public void setId(int id) {
        this.id = id; // Uso de variable primitiva
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Uso de variable de referencia
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre; // Uso de variable de referencia
    }

    // Getter para tipo
    public String getTipo() {
        return tipo; // Uso de variable de referencia
    }

    // Setter para tipo
    public void setTipo(String tipo) {
        this.tipo = tipo; // Uso de variable de referencia
    }

    // Getter para editorial
    public String getEditorial() {
        return editorial; // Uso de variable de referencia
    }

    // Setter para editorial
    public void setEditorial(String editorial) {
        this.editorial = editorial; // Uso de variable de referencia
    }

    // Getter para año
    public int getAño() {
        return año; // Uso de variable primitiva
    }

    // Setter para año
    public void setAño(int año) {
        this.año = año; // Uso de variable primitiva
    }

    // Getter para autor
    public Autor getAutor() {
        return autor; // Uso de variable de referencia
    }

    // Setter para autor
    public void setAutor(Autor autor) {
        this.autor = autor; // Uso de variable de referencia
    }

    public String toString() {
        return "Datos Libro: " + '\n' +
                "nombre= " + nombre + '\n' +
                "tipo= " + tipo + '\n' +
                "editorial= " + editorial + '\n' +
                "año=" + año + '\n' +
                autor + '\n' + // Llamada al método toString() de la variable de referencia 'autor'
                "-------------------------";
    }
}