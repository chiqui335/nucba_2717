package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

public class Main {
    private static Empleado empleado = Empleado.getInstance();
    public static void main(String[] args) {
        Adoptante adoptante = new Adoptante();

        //se piden los datos del empleado
        empleado.datosEmpleado();

        //se piden los datos del adoptante
        adoptante.datosAdoptante();





        
    }
}
