package CUATRIMESTRE_2.POO.Semana_11.Tp_notas;

public class Alumno{
    
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;

    }

        public Alumno(int idasignatura1, int idasignatura2, int idasignatura3){
            this.asignatura1 = new Asignatura(idasignatura1);
            this.asignatura2 = new Asignatura(idasignatura2);
            this.asignatura3 = new Asignatura(idasignatura3);
        }

    // Getter para asignatura1
    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    // Getter para asignatura2
    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    // Getter para asignatura3
    public Asignatura getAsignatura3() {
        return asignatura3;
    }

}