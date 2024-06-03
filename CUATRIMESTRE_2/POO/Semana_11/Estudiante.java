package CUATRIMESTRE_2.POO.Semana_11;

public class Estudiante {
    private String name;
    private int age;
    private double[] califications;

    
    public Estudiante(String name, int age, double[] califications){
        this.name = name;
        this.age = age;
        this.califications = califications;
    }

    public double prom(){
        double suma = 0;
        for (double calificacion : califications){ //Los dos puntos (:) en este contexto significan "en" o "dentro de". Puedes leerlo como "para cada calificacion en calificaciones".
            suma += calificacion;                   //En cada iteración, el bucle toma el siguiente elemento del arreglo calificaciones y lo asigna a la variable calificacion.
        }
        return suma / califications.length; //se divide la suma de las calificaciones por el largo del array
    }

    public boolean Aprobado (){
        for (double calificacion : califications){
            if (calificacion < 4.0){
                return false;
            }
        }
        return true;
    }

    //setters y getters para encapsulamiento
    public void setName(){
        this.name = name;
    }

    public void setAge(){
        this.age = age;
    }

    public void setCalifications(double[] califications){
        this.califications = califications;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double[] getCalifications(){
        return califications;
    }

}
