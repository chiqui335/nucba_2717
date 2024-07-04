package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_11.Ej2;

public class Estudiante {
    private String nombre;
    private int edad;
    private double[] calificaciones;

    public Estudiante(String nombre, int edad, double[] calificaciones){
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    public double prom(){
        double suma = 0;
        for (double calificacion : calificaciones){ 
            //TipoElemento elemento : coleccion
            //TipoElemento: El tipo de los elementos en la colección (en este caso, double).
            //elemento: Una variable que representa cada elemento en la colección durante cada iteración del bucle.
            //coleccion: La colección de elementos a través de la cual se está iterando (en este caso, el array calificaciones).
            suma += calificacion;           //se suma las notas a la variable "suma"
        } 
        return suma / calificaciones.length; //se divide el total de suma con el largo del array califiaciones
    }

    public boolean haAprobado(){
        for (double calificacion : calificaciones){
            if (calificacion < 4.0){
                return false;
            }
        }
        return true;
    }

    
}
