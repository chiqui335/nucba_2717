package CUATRIMESTRE_2.POO.actividades.Calcular;

public class calcular {

    private int suma;

    public int sumar() {
        // int suma = 0; se puede hacer asi pero es mejor el de arriba el private;
        // que sea = 0 es mejor asi no hay errores

        for (int i = 0; i <= 10; i++) {
            suma += i; // Suma el valor actual de i a la variable suma
        }
        return suma;
    }

    public static void main(String[] args) {

        calcular calculadora = new calcular(); // creo una instancia de la clase calcular
        int result = calculadora.sumar(); // llamo al metodo sumar y a pongo en la variabe result

        System.out.println("La suma de los enteros del 1 al 10 es: " + result);
    }
}
