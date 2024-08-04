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

    //setters y getters 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    // Metodo para retornar el numero maximo de ruedas
    public int maxRuedas() {
        return 4; // Coche tiene 4 ruedas maximo
    }

    // Metodo toString
    public String toString() {
        return "Coche - Marca: " + marca + ", Kilometraje: " + Kilometraje + ", Puertas: " + nroPuertas + '\n';
    }
}
