package CUATRIMESTRE_2.POO.Final.Vehiculos;

public class Coche extends Vehiculo {
    private int id;
    private int nroPuertas;

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

    // Metodo/getter para retornar el numero maximo de ruedas
    public int getMaxRuedas() {
        return 4; // Coche tiene 4 ruedas maximo
    }

    @Override
    public String toString() {
        return "Coche - Marca: " + marca + ", Kilometraje: " + Kilometraje + ", Puertas: " + nroPuertas;
    }
}
