package CUATRIMESTRE_2.POO.Semana_11;

public class Rectangulo {
    private double longitud, ancho; //si tienen el mismo tipo de dato se pueden separar con comas


    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return longitud * ancho;
    }

    public double calcularPerimetro(){
        return (longitud + ancho) * 2;
    }

    //setters y getters para encapsulamiento

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLongitud() {
        return longitud;
    }
}
