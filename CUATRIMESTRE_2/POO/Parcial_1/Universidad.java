package CUATRIMESTRE_2.POO.Parcial_1;

public class Universidad {
    public static void main(String[] args) {

        // Asignaturas
        Asignatura A1 = new Asignatura();
        A1.setNombreAsignatura("Anatomia");
        A1.setCodigo("ACM225");
        A1.setSemestre(1);

        Asignatura A2 = new Asignatura();
        A2.setNombreAsignatura("Salud publica");
        A2.setCodigo("ACM649");
        A2.setSemestre(3);

        Asignatura A3 = new Asignatura();
        A3.setNombreAsignatura("Fisiologia");
        A3.setCodigo("ACM279");
        A3.setSemestre(2);

        // Profesores
        Profesor P1 = new Profesor();
        P1.setNombreProfesor("Maria Pereyra");
        P1.setIdProfesor(455);
        P1.setAsignatura(A3);

        Profesor P2 = new Profesor();
        P2.setNombreProfesor("Juan Perez");
        P2.setIdProfesor(888);
        P2.setAsignatura(A2);

        Profesor P3 = new Profesor();
        P3.setNombreProfesor("Leonardo Coscarelli");
        P3.setIdProfesor(101);
        P3.setAsignatura(A1);

        // Departamentos
        Departamento D1 = new Departamento();
        D1.setNombreDepartamento("Departamento de enfermeria");
        D1.setProfesor(P2);
        D1.setId(801);

        Departamento D2 = new Departamento();
        D2.setNombreDepartamento("Departamento de Medicina");
        D2.setProfesor(P3);
        D2.setId(165);

        Departamento D3 = new Departamento();
        D3.setNombreDepartamento("Departamento de Bioquimica");
        D3.setProfesor(P1);
        D3.setId(420);

        System.out.println(D1.toString());
        System.out.println("---------------------------------------");
        System.out.println(D2.toString());
        System.out.println("---------------------------------------");
        System.out.println(D3.toString());

    }
}