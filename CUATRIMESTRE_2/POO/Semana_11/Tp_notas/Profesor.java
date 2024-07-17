package CUATRIMESTRE_2.POO.Semana_11.Tp_notas;

import java.util.Random;

public class Profesor{
    
    Random random = new Random();

    public void ponerNotas (Alumno alumno){
        
        alumno.getAsignatura1().setCalificacion(random.nextDouble() * 10.0);
        alumno.getAsignatura2().setCalificacion(random.nextDouble() * 10.0);
        alumno.getAsignatura3().setCalificacion(random.nextDouble() * 10.0);
    }

    public double calcularMedia(Alumno alumno){
        
        double calif1 = alumno.getAsignatura1().getCalificacion();
        double calif2 = alumno.getAsignatura2().getCalificacion();
        double calif3 = alumno.getAsignatura3().getCalificacion();

        double media = (calif1 + calif2 + calif3) / 3.0; 
        return media;
    }


}

