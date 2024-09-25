package CUATRIMESTRE_3.Prog_avanzada.Clase10;

import java.util.Scanner;

public class Main {
    private static Biblioteca biblioteca = Biblioteca.getInstance()
    //private static Scanner sc = new Scanner(System.in); puede ser asi o dentro de main

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int opcion;

        do {
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    biblioteca.agregarItem();
                    break;

                case 2:
                    biblioteca.registrarUsuario(null);
                    break;

                case 3:
                    biblioteca.realizarPrestamo();
                    break;
                
                case 4:
                    biblioteca.devolverItem();
                    break;
                
                case 5:
                    biblioteca.mostrarInventario();
                    break;

                case 6:
                    System.out.println("Saliendo del programa");
                    break;
            
                default:
                System.out.println("Opcion no valida");
                    break;
            }
    } while (opcion != 7);
}

private static void mostrarMenu(){
    System.out.println("\nMenu:");
    System.out.println("1. Agregar un item");
    System.out.println("2. Registrar un usuario");
    System.out.println("3. Realizar un prestamo");
    System.out.println("4. Devolver un item");
    System.out.println("5. Mostrar inventario");
    System.out.println("6. Salir");
    System.out.print("Ingrese una opcion: ");
}
