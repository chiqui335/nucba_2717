package parcial_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un cajero automatico
        //CajeroAutomatico cajero = new CajeroAutomatico(1, 20000.0);
        
        CajeroAutomatico.obtenerCajeroAutomatico(1); //por defecto ya viene preestablecido en 50000 la cantidad de dinero, el cajero se levanta mediante una query sql
        
        //Cliente.registrarUsuario();
        
        //Empleado.reponerDinero();
        
        System.out.println("Bienvenido al sistema del cajero automático.");
        
        System.out.println("\nSeleccione tipo de usuario");
        System.out.println("1. Cliente");
        System.out.println("2. Empleado");

        int opcionMenu = sc.nextInt();

        switch (opcionMenu) {
            case 1:
                
                Cliente cliente = Cliente.iniciarSesion();
                
                Cliente.opcionesCliente(cliente);
                
                break;

            case 2:

                break;
        
            default:
                break;
        }
        
       
        
        
        //TO DO:
        
        
        
        
//       // Probar inicio de sesión
//        System.out.println("Iniciando sesión...");
//        if (Cliente.iniciarSesion()) {
//            
//            
//        } else {
//            System.out.println("Credenciales incorrectas.");
//            return;
//        }



        
    }
}

