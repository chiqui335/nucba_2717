package CUATRIMESTRE_3.Prog_avanzada.Clase10;

public class Libro extends Item {
    
    public libro (String titulo, int año, String iSBN, String titulo){
        super(titulo, año, iSBN);
        this.autor = autor; 
    }

    public String toString() {
        return "Libro: " + titulo + ", Año: " + año + ", ISBN: " + iSBN + ", Autor: " + autor;
    }
}
