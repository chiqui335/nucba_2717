package CUATRIMESTRE_2.POO.Final.SistemaGaraje;

import CUATRIMESTRE_2.POO.Final.Vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Garage {


    // to do: 
    // -acomodar metodo para calcular el precio de cambio de ruedas de todos los vehiculos del garage
    protected int id;
    protected int capMax;
    protected double precioCambioRueda; 
    protected List<Vehiculo> vehiculos;

    public Garage() {
        this.id = 0;
        this.capMax = 0;
        this.precioCambioRueda = 0.0;
        this.vehiculos = new ArrayList<>();
    }

    public Garage (int id, int capMax, int precioCambioRueda){
        this.id = id;
        this.capMax = capMax;
        this.precioCambioRueda = precioCambioRueda;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() >= capMax) {
            System.out.println("El garaje está lleno.");
        } else {
            vehiculos.add(vehiculo);
            System.out.println("Vehiculo agregado al garaje.");
            System.out.println("hay un total de " + vehiculos.size() + " vehiculos");
        }
    }

    public void quitarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.isEmpty()) {
            System.out.println("El garaje está vacío.");
        } else {
            vehiculos.remove(vehiculo);
            System.out.println("Vehiculo removido del garaje.");
            System.out.println("hay un total de " + vehiculos.size() + " vehiculos");
        }
    }


    //Metodo para ver el numero de vehiculos en el garage
    public int numeroVehiculos() {
        return vehiculos.size();
    }


    //calcular el precio de cambio de ruedas de todos los vehiculos del garage
    public double precioCambioTotal() {
        double total = 0;
        for (Vehiculo vehiculo : vehiculos) {
            total += vehiculo.getNroRuedas() * precioCambioRueda;
        }
        return total;
    }

    //calcular el kilometraje medio de todos los vehiculos del garage
    public double KilometrajeMedio () {
        double totalKilometros = 0;
        for (Vehiculo vehiculo : vehiculos) {
            totalKilometros += vehiculo.getKilometraje();
        }
        return totalKilometros / vehiculos.size();
    }

    //Mostrar vehiculos en el garage
    public void vehiculosIngresados() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}
