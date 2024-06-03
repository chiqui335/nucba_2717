package CUATRIMESTRE_2.POO.Semana_11;

public class testEstudiante {
    public static void main(String[] args){

        //array calificaciones
        double[] califications = {4.5, 6.7, 2.0, 10.0, 5.3};

        //obj estudiante
        Estudiante estudiante = new Estudiante("Jose", 20, califications);

        System.out.println("promedio del estudiante " + estudiante.getName() + " es: " + estudiante.prom());
        
        if(estudiante.Aprobado()){
            System.out.println("el estudiante " + estudiante.getName() + " esta aprobado en todas las materias");
        }else{
            System.out.println("el estudiante " + estudiante.getName() + " no esta aprobado en todas las materias");
        }
    }
}
