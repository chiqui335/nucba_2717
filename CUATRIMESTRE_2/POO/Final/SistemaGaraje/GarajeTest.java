package CUATRIMESTRE_2.POO.Final.SistemaGaraje;

import CUATRIMESTRE_2.POO.Final.Vehiculos.Coche;
import CUATRIMESTRE_2.POO.Final.Vehiculos.Moto;
import CUATRIMESTRE_2.POO.Final.Vehiculos.Vehiculo;

public class GarajeTest {
    public static void main(String[] args) {
        
        Garage garaje = new Garage(1, 5, 1000); // Ejemplo de precio de cambio de rueda

        // Crear vehículos
        Vehiculo coche1 = new Coche("toyota", 20000, 4, 1, 4);
        Vehiculo moto1 = new Moto("honda", 15000, 2, 1, 150);
        Vehiculo moto2 = new Moto("honda", 3000, 2, 2, 200);


        // Ingresar vehículos al garaje
        garaje.agregarVehiculo(coche1);
        garaje.agregarVehiculo(moto1);
        garaje.agregarVehiculo(moto2);
        garaje.quitarVehiculo(moto2);


        // Mostrar información del garaje
        System.out.println("Precio total para cambiar todas las ruedas: " + garaje.precioCambioTotal());
        System.out.println("Kilometraje medio de los vehículos: " + garaje.KilometrajeMedio());

        System.out.println("Vehículos ingresados en el garaje:");
        garaje.vehiculosIngresados();
    }
}
