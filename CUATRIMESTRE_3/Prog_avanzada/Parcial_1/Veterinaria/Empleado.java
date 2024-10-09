package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Empleado {
    private static Empleado instance;
    private String nombre;
    private int id;
    private String cargo;

    private Empleado() {

    }

    public static Empleado getInstance() {
        if(instance == null) {
            instance = new Empleado();
        }
        return instance;
    }
    //Manejo de datos
    public void datosEmpleado(){
        Scanner sc = new Scanner(System.in);

        //nombre
        System.out.println("Ingrese los datos del empleado:");
        //nombre
        System.out.print("Nombre: ");
        String nombreEmpleado = sc.nextLine();

        //id
        int idEmpleado = -1;
        while (idEmpleado == -1) {
            try {
                System.out.println("ID:");
                idEmpleado = sc.nextInt();  // Puede lanzar InputMismatchException

                if (idEmpleado <= 0) {
                    System.out.println("Por favor, introduce un ID válido (mayor a 0).");
                    idEmpleado = -1;  // Reiniciar para que el ciclo vuelva a pedir el ID
                } 
                sc.nextLine();


            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido para el ID.");
                sc.nextLine(); 
            }
        }

        //cargo
        System.out.print("Cargo: ");
        String cargoEmpleado = sc.nextLine();

        //se modifica el empleado con los datos ingresados
        Empleado empleado = Empleado.getInstance();
        empleado.registrarEmpleado(nombreEmpleado, cargoEmpleado, idEmpleado);
    }


    public void registrarEmpleado(String nombre, String cargo, int id) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    

    @Override
    public String toString() {
        return "Empleado Encargado: " + "\n" +
                "Nombre:" + nombre + "\n" +
                "Cargo: " + cargo + "\n";
    }
}
