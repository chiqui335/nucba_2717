package CUATRIMESTRE_2.POO.Semana_11.Tp_notas;

public class Asignatura{
    private int id;
    private double calificacion;


    public Asignatura(int id){
        this.id = id;
    }

    // Getter para el atributo identificador
    public int getIdentificador() {
        return id;
    }

    // Getter para el atributo calificacion
    public double getCalificacion() {
        return calificacion;
    }

    // Setter para el atributo calificacion
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}