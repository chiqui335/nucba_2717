package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_11.Ej1;

public class ArbolTest {
    public static void main(String[] args){
        Arbol a1 = new Arbol();
        Arbol a2 = new Arbol(5, "pino");
        Arbol a3 = new Arbol("roble");
        Arbol a4 = new Arbol(4);

    System.out.println(a1); // una forma
    System.out.println();
    System.out.println(a2.toString());
    System.out.println();
    System.out.println(a3.toString());
    System.out.println();
    System.out.println(a4.toString());
    }
}
