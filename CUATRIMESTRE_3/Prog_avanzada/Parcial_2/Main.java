package CUATRIMESTRE_3.Prog_avanzada.Parcial_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema del cajero automático.");
        
        // Crear un cliente de ejemplo
        Cliente cliente = new Cliente("1234567890", "contraseñaSegura");
        
        // Crear un cajero automatico
        CajeroAutomatico cajero = new CajeroAutomatico(1, 20000.0);
        
        cajero.getCantidadDinero();
        
        // Probar inicio de sesión
        System.out.println("Iniciando sesión...");
        if (cliente.iniciarSesion()) {
            System.out.println("Bienvenido cliente " + cliente.getNombre());
            System.out.println("Saldo actual: " + cajero.obtenerSaldo(cliente));
        } else {
            System.out.println("Credenciales incorrectas.");
            return;
        }
        
        
        
     // Funciones para el cliente QUITAR
        cliente.opcionesCliente();

        System.out.println("\nSeleccione tipo de usuario");
        System.out.println("1. Cliente");
        System.out.println("2. Empleado");

        int opcionMenu = sc.nextInt();

        switch (opcionMenu) {
            case 1:
                Cliente.iniciarSesion();
                
                break;

            case 2:

                break;
        
            default:
                break;
        }

        

        switch (cajero) {
            case value:
                
                break;
        
            default:
                break;
        }



    }
}



