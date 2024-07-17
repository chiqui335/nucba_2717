package CUATRIMESTRE_2.POO.Final.Vehiculos;

public class Vehiculo {
    protected String marca;
    protected double Kilometraje;
    protected int nroRuedas;

    public Vehiculo() {
        this.marca = "desconocida";
        this.Kilometraje = 0.0;
        this.nroRuedas = 0;
    }

    public Vehiculo(String marca, double Kilometraje, int nroRuedas) {
        this.marca = marca;
        this.Kilometraje = Kilometraje;
    }

    public double getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(double Kilometraje) {
        this.Kilometraje = Kilometraje;
    }
    
    public int getNroRuedas() {
        return nroRuedas;
    }

    public void setNroRuedas(int nroRuedas) {
        this.nroRuedas = nroRuedas;
    }
}
