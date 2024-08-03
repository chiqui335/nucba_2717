package CUATRIMESTRE_2.POO.Final.SistemaGaraje;

import CUATRIMESTRE_2.POO.Final.Vehiculos.Coche;
import CUATRIMESTRE_2.POO.Final.Vehiculos.Moto;
import CUATRIMESTRE_2.POO.Final.Vehiculos.Vehiculo;

public class GarajeTest {
    public static void main(String[] args) {
        
        Garage garaje = new Garage(1, 5, 1000); // Ejemplo de precio de cambio de rueda

        // Crear vehículos
        Vehiculo moto1 = new Moto("honda", 15000, 2, 1, 150);
        Vehiculo moto2 = new Moto("honda", 3000, 2, 2, 200);
        Vehiculo moto3 = new Moto("yamaha", 25000, 2, 3, 180);
        Vehiculo coche1 = new Coche("toyota", 50000, 4, 1, 4);
        Vehiculo coche2 = new Coche("audi", 30000, 4, 2, 5);
        Vehiculo coche3 = new Coche("volkswagen", 200000, 4, 3, 4);


        // Ingresar/quitar vehículos al garaje
        garaje.quitarVehiculo(coche1); // output: "garaje vacio"
        garaje.agregarVehiculo(coche1);
        garaje.agregarVehiculo(coche1); //output: el vehiculo ya esta en el garage
        garaje.agregarVehiculo(coche2);
        garaje.agregarVehiculo(coche3);
        garaje.quitarVehiculo(coche1);
        garaje.quitarVehiculo(coche1); // output: "el vehiculo no esta en el garage"
        garaje.agregarVehiculo(coche1);
        garaje.agregarVehiculo(moto3);
        garaje.agregarVehiculo(moto1);
        garaje.agregarVehiculo(moto2);  // output: "garaje lleno"
        garaje.quitarVehiculo(moto2); // output: "garaje vacio"

        // Cambiar número de ruedas especifico de un vehículo
        garaje.precioCambio(coche1, 3);

        // Mostrar información del garaje
        garaje.precioCambio();
        garaje.KilometrajeMedio();
        
        garaje.precioCambio(moto1);
        
    
        System.out.println("Vehículos ingresados en el garaje:");
        garaje.vehiculosIngresados();

        garaje.numeroVehiculos();
    }
}
