package CUATRIMESTRE_2.POO.actividades.Empleados;

public class Empleado {

    private int id;
    private String nombre;
    private boolean accesoPrivilegiado;
    private double sueldo;

    // Constructores

    public Empleado(String nombre, int id, boolean accesoPrivilegiado, double sueldo) {

        this.nombre = nombre;
        this.id = id;
        this.accesoPrivilegiado = accesoPrivilegiado;
        this.sueldo = sueldo;
    }

    // getters

    public String getNombre() {

        return nombre;
    }

    public int getId() {

        return id;
    }

    public boolean getaccespoPrivilegiado() {

        return accesoPrivilegiado;
    }

    public double getSueldo() {

        return sueldo;
    }

    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setaccesoPrivilegiado(boolean accesoPrivilegiado) {
        this.accesoPrivilegiado = accesoPrivilegiado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}