package CUATRIMESTRE_2.POO.Parcial_2_conArrays;

public class Prestamo {
    private int id;
    private Copia copiaLibro;
    private Lector lector;

    // Constructor predeterminado
    public Prestamo() {
        this.id = 0;

        this.copiaLibro = null;
        this.lector = null;
    }

    // Constructor con parametros
    public Prestamo(int id, Copia copiaLibro, Lector lector) {
        this.id = id;
        this.copiaLibro = copiaLibro;
        this.lector = lector;
    }

    // Getter para id
    public int getId() {
        return id;
    }

    // Setter para id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para copiaLibro
    public Copia getCopiaLibro() {
        return copiaLibro;
    }

    // Setter para copiaLibro
    public void setCopiaLibro(Copia copiaLibro) {
        this.copiaLibro = copiaLibro;
    }

    // Getter para lector
    public Lector getLector() {
        return lector;
    }

    // Setter para lector
    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public String toString() {
        return "Datos Prestamo: " + '\n' +
                "id= " + id + '\n' +
                "copiaLibro= " + copiaLibro + '\n' +
                "lector= " + lector;
    }
    

}
