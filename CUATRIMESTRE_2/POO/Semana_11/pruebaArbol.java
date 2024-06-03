package CUATRIMESTRE_2.POO.Semana_11;

public class pruebaArbol {
    public static void main(String[] args){
        Arbol a1 = new Arbol(4);

        Arbol a2 = new Arbol("roble");

        Arbol a3 = new Arbol("pino", 5);

        Arbol a4 = new Arbol();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
