package CUATRIMESTRE_2.POO.actividades.Modelo_parcial;

public class Libro {
    private String nombreLibro;
    private Autor autor;
    private Editorial editorial; // variables de instancia
    private int añoPublicacion;
    private int nroEjemplares;
    private double costo;

    // setters

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro; // variables locales
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setNroEjemplares(int nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    // getters

    public String getNombreLibro() {
        return nombreLibro;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public int getNroEjemplares() {
        return nroEjemplares;
    }

    public double getCosto() {
        return costo;
    }

    // sobreescritura del metodo toString SI SE USA ESTE NO SE USAN GETTERS,
    // pareciera ser mas eficiente
    public String toString() {

        return "Nombre del libro : " + nombreLibro + "\nDatos del autor: \n" + autor + "\n+++++++++++++++++++++++\n" +
                "\nDatos de la editorial: \n" + editorial + "\n+++++++++++++++++++++++\n" + "\nFecha de publicacion: "
                + añoPublicacion + "\nNumero de ejempleares: " + nroEjemplares + "\nCosto: $" + costo;
    }
}
