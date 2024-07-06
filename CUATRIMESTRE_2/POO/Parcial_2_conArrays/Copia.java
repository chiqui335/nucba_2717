package CUATRIMESTRE_2.POO.Parcial_2_conArrays;

public class Copia {
    private int id;
    private String estado;
    private Libro libro;

    // Constructor predeterminado
    public Copia(){
        this.id = 0;
        this.estado = "Desconocido";
        this.libro = null;
    }

    // Constructor con parametros
    public Copia(int id, String estado, Libro libro) {
        this.id = id;
        this.estado = estado;
        this.libro = libro;
    }

    // Getter para id
    public int getId() {
        return id;
    }

    // Setter para id
    public void setId(int id) {
        this.id = id;
    }


    // Getter para estado
    public String getEstado() {
        return estado;
    }

    // Setter para estado
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Getter para libro
    public Libro getLibro() {
        return libro;
    }

    // Setter para libro
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    public void mostrarEstadoCopia() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Datos Copia: " + '\n' +
                "id= " + id + '\n' +
                "estado= " + estado + '\n' +
                libro;
    }
        

}

