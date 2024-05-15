package CUATRIMESTRE_2.POO.Semana_8.SobreCargaMetodos;

public class Sobrecarga {

    // se llaman todos los metodos iguales porque los
    // sobrecargo con mas de una funcionalidad
    // eso se hace en los parametros
    // (lo que esta entre parentesis ej int a, int b etc)

    // lo que se retorna depende de los parametros que le estoy dando
    // public [INT] (esto es el tipo de dato que hace return)

    public int multiplicar(int a, int b) {
        return a * b;

    }

    public double multiplicar(double a, double b) {
        return a * b;

    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;

    }
}
