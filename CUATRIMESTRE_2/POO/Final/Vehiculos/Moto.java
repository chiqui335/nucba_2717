package CUATRIMESTRE_2.POO.Final.Vehiculos;

public class Moto extends Vehiculo{ //realizamos herencia de Vehiculo sobre Moto
    private int id; //realizamos encapsulamiento private debido a que no se tendra subclases
    private int cilindrada;

    //utilizamos super()
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

    //getters 
    public int getId() {
        return id;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    // Metodo toString
    public String toString() {
        return "Moto - Marca: " + marca + ", Kilometraje: " + kilometraje + ", Cilindrada: " + cilindrada + '\n';
    }
}
