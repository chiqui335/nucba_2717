package CUATRIMESTRE_2.POO.actividades.Calcular;

public class calcularPrueba {
    public static void main(String[] args) {

        calcular calculadora = new calcular(); // creo una instancia de la clase calcular
        int result = calculadora.sumar(); // llamo al metodo sumar y a pongo en la variabe result

        System.out.println("La suma de los enteros del 1 al 10 es: " + result);
    }
}
