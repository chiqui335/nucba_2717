package CUATRIMESTRE_2.POO.Parcial_2_conArrays;

public class Copia {
    // Declaración de variables primitivas
    private int id;
    // Declaración de variables de referencia
    private String estado;
    private Libro libro;

    // Constructor predeterminado
    public Copia() {
        // Asignación de valores a variables primitivas y de referencia
        this.id = 0; // Variable primitiva
        this.estado = "Desconocido"; // Variable de referencia
        this.libro = null; // Variable de referencia
    }

    // Constructor con parámetros
    public Copia(int id, String estado, Libro libro) {
        // Asignación de valores a variables primitivas y de referencia
        this.id = id; // Variable primitiva
        this.estado = estado; // Variable de referencia
        this.libro = libro; // Variable de referencia
    }

    // Getter para id (variable primitiva)
    public int getId() {
        return id; // Retorno de variable primitiva
    }

    // Setter para id (variable primitiva)
    public void setId(int id) {
        this.id = id; // Asignación a variable primitiva
    }

    // Getter para estado (variable de referencia)
    public String getEstado() {
        return estado; // Retorno de variable de referencia
    }

    // Setter para estado (variable de referencia)
    public void setEstado(String estado) {
        this.estado = estado; // Asignación a variable de referencia
    }

    // Getter para libro (variable de referencia)
    public Libro getLibro() {
        return libro; // Retorno de variable de referencia
    }

    // Setter para libro (variable de referencia)
    public void setLibro(Libro libro) {
        this.libro = libro; // Asignación a variable de referencia
    }
    
    // Método que muestra los datos de la copia
    public void mostrarDatosCopia() {
        System.out.println(this.toString()); // Llamada al método toString
    }

    // Método que muestra el estado de la copia
    public void mostrarEstadoCopia() {
        System.out.println("El estado de la copia del libro " + libro.getNombre() + " es: " + this.estado);
    }

    // Sobrescritura del método toString
    public String toString() {
        return "Datos Copia: " + '\n' +
                "id= " + id + '\n' + // Variable primitiva
                "estado= " + estado + '\n' + // Variable de referencia
                libro; // Variable de referencia
    }
}