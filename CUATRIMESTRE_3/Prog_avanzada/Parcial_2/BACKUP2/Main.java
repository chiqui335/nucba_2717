package parcial2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un cajero automatico
        CajeroAutomatico cajero = CajeroAutomatico.obtenerCajeroAutomatico(1);

        //inicio de cajero

        System.out.println("Bienvenido al sistema del cajero automático.");

        while (true) {
            System.out.println("\nSeleccione opción:");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrar");
            System.out.println("3. Salir");

            int opcionInicio = sc.nextInt();

            switch (opcionInicio) {
                case 1:
                    while (true) {
                        System.out.println("\nSeleccione tipo de usuario:");
                        System.out.println("1. Cliente");
                        System.out.println("2. Empleado");
                        System.out.println("3. Regresar");

                        int opcionMenu = sc.nextInt();

                        switch (opcionMenu) {
                            case 1: // Inicia sesión como cliente
                                Cliente cliente = Cliente.iniciarSesion();
                                if (cliente != null) {
                                    cliente.opcionesCliente(cliente, cajero);
                                }
                                break;

                            case 2: // Inicia sesión como empleado
                                Empleado empleado = Empleado.iniciarSesion();
                                if (empleado != null) {
                                    empleado.opcionesEmpleado(empleado, cajero);
                                }
                                break;

                            case 3: // Regresar al menú principal
                                break;

                            default:
                                System.out.println("Opción no válida.");
                                continue; // Regresar al menú de tipo de usuario
                        }
                        break; // Salir del bucle del submenú de iniciar sesión
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\nSeleccione tipo de usuario a registrar:");
                        System.out.println("1. Cliente");
                        System.out.println("2. Empleado");
                        System.out.println("3. Regresar");

                        int opcionRegistro = sc.nextInt();

                        switch (opcionRegistro) {
                            case 1: // Registro de cliente
                                Cliente.registrarCliente();
                                break;

                            case 2: // Registro de empleado
                                Empleado.registrarEmpleado();
                                break;

                            case 3: // Regresar al menú principal
                                break;

                            default:
                                System.out.println("Opción no válida.");
                                continue; // Regresar al menú de registro
                        }
                        break; // Salir del bucle del submenú de registro
                    }
                    break;

                case 3:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    return; // Finaliza el programa

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }



        
    }
}

