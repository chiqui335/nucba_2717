package CUATRIMESTRE_2.POO.actividades.ActSobrecargaMetodos;

public class EjercicioSobrecarga {

    public int sumar(int sumUno, int sumDos) { // a
        return sumUno * sumDos;
    }

    public double sumar(int sumUno, double sumDos) { // b
        return sumUno * sumDos;
    }

    public float sumar(float sumUno, float sumDos) {// c
        return sumUno * sumDos;
    }

    public float sumar(float sumUno, int sumDos) {// d
        return sumUno * sumDos;
    }

    public double sumar(double sumUno, int sumDos) {// e
        return sumUno * sumDos;
    }
}
