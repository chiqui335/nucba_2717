package CUATRIMESTRE_2.POO.Final.Vehiculos;

public class Coche extends Vehiculo { //realizamos herencia de Vehiculo sobre Coche
    private int id; //realizamos encapsulamiento private debido a que no se tendra subclases
    private int nroPuertas;

    //utilizamos super()
    public Coche() {
        super();
        this.id = 0;
        this.nroPuertas = 0;
    }

    public Coche(String marca, double Kilometraje, int nroRuedas, int id, int nroPuertas) {
        super(marca, Kilometraje, nroRuedas);
        this.id = id;
        this.nroPuertas = nroPuertas;
    }

    //getters 
    public int getId() {
        return id;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    // Metodo toString
    public String toString() {
        return "Coche - Marca: " + marca + ", Kilometraje: " + kilometraje + ", Puertas: " + nroPuertas + '\n';
    }
}
