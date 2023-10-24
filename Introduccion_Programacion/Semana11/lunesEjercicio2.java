package Introduccion_Programacion.Semana11;

import java.util.Scanner;

public class lunesEjercicio2 {
    public static void main(String[] args) {
        String[] productos = new String[50];
        productos[0] = "Zanahoria";
        productos[1] = "Cebolla";
        productos[2] = "Tomate";
        productos[3] = "Papa";
        int cantidadProductos = 4;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("a) Eliminar productos");
            System.out.println("b) Buscar producto");
            System.out.println("c) Remover un producto");
            System.out.println("d) Añadir producto");
            System.out.println("e) Salir");
            System.out.print("Seleccione una opción: ");
            char opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    for (int i = 0; i < productos.length; i++) {
                        productos[i] = null;
                    }
                    cantidadProductos = 0;
                    System.out.println("Productos eliminados.");
                    break;

                case 'b':
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    String productoABuscar = scanner.nextLine();
                    int posicion = -1;
                    for (int i = 0; i < cantidadProductos; i++) {
                        if (productos[i] != null && productos[i].equalsIgnoreCase(productoABuscar)) {
                            posicion = i;
                            break;
                        }
                    }
                    if (posicion != -1) {
                        System.out.println("El producto está en la posición " + posicion);
                    } else {
                        System.out.println("El producto no se encuentra en la lista.");
                    }
                    break;

                case 'c':
                    System.out.print("Ingrese el nombre del producto a remover: ");
                    scanner.nextLine();
                    String productoARemover = scanner.nextLine();
                    int indice = -1;
                    for (int i = 0; i < cantidadProductos; i++) {
                        if (productos[i] != null && productos[i].equalsIgnoreCase(productoARemover)) {
                            indice = i;
                            break;
                        }
                    }
                    if (indice != -1) {
                        for (int i = indice; i < cantidadProductos - 1; i++) {
                            productos[i] = productos[i + 1];
                        }
                        productos[cantidadProductos - 1] = null;
                        cantidadProductos--;
                        System.out.println("El producto ha sido removido.");
                    } else {
                        System.out.println("El producto no se encuentra en la lista.");
                    }
                    break;

                case 'd':
                    if (cantidadProductos < productos.length) {
                        System.out.print("Ingrese el nombre del producto a añadir: ");
                        scanner.nextLine();
                        String nuevoProducto = scanner.nextLine();
                        productos[cantidadProductos] = nuevoProducto;
                        cantidadProductos++;
                        System.out.println("El producto ha sido añadido.");
                    } else {
                        System.out.println("El límite de productos ha sido alcanzado.");
                    }
                    break;

                case 'e':
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
