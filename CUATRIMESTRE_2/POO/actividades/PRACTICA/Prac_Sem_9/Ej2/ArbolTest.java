package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_9.Ej2;

public class ArbolTest {
    
    public static void main(String[] args){
        
        Arbol a1 = new Arbol(4);
        Arbol a2 = new Arbol("roble");
        Arbol a3 = new Arbol(5, "pino");
        Arbol a4 = new Arbol();

      

        System.out.println(a1);
        System.out.println();
        System.out.println(a2.toString());
        System.out.println();
        System.out.println(a3.toString());
        System.out.println();
        System.out.println(a4.toString());
    }

}
