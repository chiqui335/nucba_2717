package CUATRIMESTRE_2.POO.Final.Vehiculos;

public class Moto extends Vehiculo{
    private int id;
    private int cilindrada;

    public Moto(){
        super();
        this.id = 0;
        this.cilindrada = 0;
    }

    public Moto (String marca, double Kilometraje, int nroRuedas, int id, int cilindrada){
        super(marca, Kilometraje, nroRuedas);
        this.id = id;
        this.cilindrada = cilindrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
