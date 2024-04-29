package CUATRIMESTRE_2.POO.actividades.Empleados;

public class EmpleadosTest {
    public static void main(String[] args) {

        Empleado E1 = new Empleado("juan", 123, true, 3000.0); // si en empleado.java hago un constructor
        Empleado E2 = new Empleado("jorge", 111, true, 3333.0); // tengo que poner los datos aca

        E2.setId(444);
        E2.setNombre("Maria");
        E2.setaccesoPrivilegiado(false); // aca se modifican los datos
        E2.setSueldo(2000.0);

        System.out.println(E1.getId());
        System.out.println(E1.getNombre());
        System.out.println(E1.getaccespoPrivilegiado());
        System.out.println(E1.getSueldo());

        System.out.println(E2.getId());
        System.out.println(E2.getNombre());
        System.out.println(E2.getaccespoPrivilegiado());
        System.out.println(E2.getSueldo());

    }
}
