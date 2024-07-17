package CUATRIMESTRE_2.POO.Semana_11.Tp_notas;

public class Principal{
    public static void main(String[] args) {

        Asignatura asignatura1 = new Asignatura(101);
        Asignatura asignatura2 = new Asignatura(102);
        Asignatura asignatura3 = new Asignatura(103);

        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);

        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno);

        double media = profesor.calcularMedia(alumno);

         // Mostrar por pantalla las calificaciones asignadas
        System.out.println("Calificaciones asignadas:");
        System.out.println("Asignatura 1 (" + alumno.getAsignatura1().getIdentificador() + "): "
                + alumno.getAsignatura1().getCalificacion());
        System.out.println("Asignatura 2 (" + alumno.getAsignatura2().getIdentificador() + "): "
                + alumno.getAsignatura2().getCalificacion());
        System.out.println("Asignatura 3 (" + alumno.getAsignatura3().getIdentificador() + "): "
                + alumno.getAsignatura3().getCalificacion());

        System.out.println("Media del alumno: " + media);

        

    }

}