package CUATRIMESTRE_2.POO.Final.SistemaGaraje;

import CUATRIMESTRE_2.POO.Final.Vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Garage {


    // to do: 
    // -(consignas como tal estan listas): capaz agregar chiche:
    // [cambiar de 1 a 4 ruedas nomas de un vehiculo (2 apra moto), con su precio total 
    // y que no se puedan cambiar mas ruedas de las que tiene el vehiculo]
    protected int id;
    protected int capMax;
    protected double precioCambioRueda; 
    protected List<Vehiculo> vehiculos;

    //constructor predeterminado
    public Garage() {
        this.id = 0;
        this.capMax = 0;
        this.precioCambioRueda = 0.0;
        this.vehiculos = new ArrayList<>();
    }

    //constructor con parametros
    public Garage (int id, int capMax, double precioCambioRueda){
        this.id = id;
        this.capMax = capMax;
        this.precioCambioRueda = precioCambioRueda;
        this.vehiculos = new ArrayList<>();
    }

    //getter precioCambioRueda
    public double getPrecioCambioRueda() {
        return precioCambioRueda;
    }

    //Metodo para agregar un vehiculo
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() >= capMax) {
            System.out.println("El garaje está lleno.");
        } else if (vehiculos.contains(vehiculo)){
            System.out.println("El vehiculo ya está en el garaje.");
        } else {
            vehiculos.add(vehiculo);
            System.out.println("Vehiculo agregado al garaje.");
            System.out.println("hay un total de " + vehiculos.size() + " vehiculos");
        }
    }

    //Metodo para quitar un vehiculo
    public void quitarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.isEmpty()) {
            System.out.println("El garaje está vacío.");
        } else if (!vehiculos.contains(vehiculo)) {
            System.out.println("El vehiculo no está en el garaje.");
        } else {
            vehiculos.remove(vehiculo);
            System.out.println("Vehiculo removido del garaje.");
            System.out.println("hay un total de " + vehiculos.size() + " vehiculos");
        }
    }


    //Metodo para ver el numero de vehiculos en el garage
    public int numeroVehiculos() {
        System.out.println("Número total de vehículos en el garaje: " + vehiculos.size());
        return vehiculos.size();
    }


    //calcular el precio de cambio de ruedas de todos los vehiculos del garage
    public double precioCambio() {
        double total = 0;
        for (Vehiculo vehiculo : vehiculos) {
            total += vehiculo.getNroRuedas() * precioCambioRueda;
        }
        System.out.println("Precio total para cambiar todas las ruedas de todos los vehículos es: " + total);
        return total;
    }

    // Sobrecarga y sobreescritura del metodo precioCambioTotal()
    public double precioCambio(Vehiculo vehiculo) { 
        double total = vehiculo.getNroRuedas() * precioCambioRueda;
        System.out.println("Precio total para cambiar todas las ruedas de " + vehiculo + " es: " + total);
        return total;
    }


    //calcular el kilometraje medio de todos los vehiculos del garage
    public double KilometrajeMedio () {
        double totalKilometros = 0;
        for (Vehiculo vehiculo : vehiculos) {
            totalKilometros += vehiculo.getKilometraje();
        }
        double total = totalKilometros / vehiculos.size();
        System.out.println("Kilometraje medio de los vehículos: " + total);
        return total;
    }

    //Mostrar vehiculos en el garage
    public void vehiculosIngresados() {
        for (Vehiculo vehiculo : vehiculos) {
            // System.out.println(vehiculo);
            System.out.println(vehiculo.toString());
        }
    }


    //METODOS EXTRA ------------------------------------------------------------
    //Metodo para cambiar X numero de ruedas por separado
    public void precioCambio(Vehiculo vehiculo, int nroRuedasACambiar) { //sobrecarga y sobreescritura del metodo precioCambio()
        int maxRuedas = vehiculo.getNroRuedas();
        if (nroRuedasACambiar < 1) {
            System.out.println("El numero de ruedas a cambiar debe ser mayor a 1");
        } else if (nroRuedasACambiar > maxRuedas) {
            System.out.println("No se pueden cambiar más ruedas de las que tiene el vehículo.");
        } else {
            double costoCambio = nroRuedasACambiar * precioCambioRueda;
            System.out.println("Costo del cambio de " + nroRuedasACambiar + " ruedas: " + costoCambio);
        }
    }

    public String toString() {
        return "Garage: " + '\n' +
                "id: " + id + '\n' +
                "capMax: " + capMax + '\n' +
                "precioCambioRueda: " + precioCambioRueda + '\n' +
                "vehiculos: " + vehiculos;
    }


}
