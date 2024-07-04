package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_11.Ej1;

public class Arbol {
    private int altura;
    private String tipo;

    public Arbol(){
        this.altura = 0;            //arbol generico
        this.tipo = "generico";
    }

    public Arbol(int altura, String tipo){
        this.altura = altura;               //pino de 5 mts
        this.tipo = tipo;
    }

    public Arbol(int altura){
        this.altura = altura;           //arbol de 4 mts
        this.tipo = "generico";
    }

    public Arbol(String tipo){      
        this.altura = 0;             //arbol tipo roble
        this.tipo = tipo;

    }

    public String toString(){
        return "Un árbol de " + altura + " metros " +
                "y es de tipo " + tipo + ".";
    }
}
