package CUATRIMESTRE_2.POO.EmpresaYo.src2.empresa2;

public class Empleado2 {

    public int numeroEmpleado;
    public String Cargo;
    public boolean plantaPermanente;

    public void mostrarInfo() {
        System.out.println(numeroEmpleado + " " + Cargo + " el empleado es planta permanente?: " + plantaPermanente);
    }
}
