package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_9.Ej2;

public class Arbol {
    
    private String tipo;
    private int altura;

    public Arbol() {
        this.altura = 0;            //árbol genérico
        this.tipo = "genérico";
    }

    public Arbol(String tipo){
        this.tipo = tipo;       //árbol tipo roble
        this.altura = 0;
    }

    public Arbol(int altura) {
        this.altura = altura;       //árbol de 4 metros
        this.tipo = "genérico";    
    }

    public Arbol(int altura, String tipo){
        this.altura = altura;           //pino de 5 metros
        this.tipo = tipo;
    }


    public String toString(){
        return "Un árbol de " + altura + " metros " +
               "y es de tipo " + tipo + ".";
    }


}
