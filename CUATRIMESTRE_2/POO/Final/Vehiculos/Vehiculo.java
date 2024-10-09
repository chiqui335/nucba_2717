package CUATRIMESTRE_2.POO.Final.Vehiculos;

public class Vehiculo {
    protected String marca;
    protected double kilometraje;   //realizamos encapsulamiento protected asi es accesible en el mismo paquete y en las subclases
    protected int nroRuedas;

    public Vehiculo() {
        this.marca = "desconocida";
        this.kilometraje = 0.0;
        this.nroRuedas = 0;
    }

    public Vehiculo(String marca, double Kilometraje, int nroRuedas) {
        this.marca = marca;
        this.kilometraje = Kilometraje;
        this.nroRuedas = nroRuedas; 
    }

    //getters
    public double getKilometraje() {
        return kilometraje;
    }
    
    public int getNroRuedas() {
        return nroRuedas;
    }

}

