package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

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

    public void datosEmpleado(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos del empleado:");
        System.out.print("Nombre: ");
        String nombreEmpleado = sc.nextLine();

        System.out.print("ID: ");
        int idEmpleado = sc.nextInt();
        sc.nextLine();

        System.out.print("Cargo: ");
        String cargoEmpleado = sc.nextLine();

        //se modifica el empleado con los datos ingresados
        Empleado empleado = Empleado.getInstance();
        empleado.registrarEmpleado(nombreEmpleado, cargoEmpleado, idEmpleado);
        sc.close();
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

    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", id=" + id +
                '}';
    }
}
