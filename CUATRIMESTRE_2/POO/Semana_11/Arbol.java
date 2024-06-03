package CUATRIMESTRE_2.POO.Semana_11;

public class Arbol {
    private String tipo;
    private int altura;

    public Arbol() {
        this.tipo = "generico";
        this.altura = 0;
        System.out.println("Un árbol " + tipo);
    }

    public Arbol(int altura) {
        this.tipo = "generico";
        this.altura = altura;
        System.out.println("Un árbol de " + altura + " metros");
    }

    public Arbol (String tipo) {
        this.tipo = tipo;
        this.altura = 0;
        System.out.println("Un árbol tipo " + tipo);
    }

    public Arbol(String tipo, int altura) {
        this.tipo = tipo;
        this.altura = altura;
        System.out.println("Un " + tipo + " de " + altura + " metros");
    }
}
