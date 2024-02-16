package Introduccion_Programacion.FINAL;

import java.util.Arrays;
import java.util.Scanner;

public class pruebas {

    
    public static void main(String[] args) { 
        String deck [][] = {{"ancho de espada"},
                            {"ancho de basto"},         //matriz con el mazo
                            {"7 de espada"},
                            {"7 de oro"},
                            {"3 de espada","3 de basto", "3 de oro", "3 de copa"},
                            {"2 de espada","2 de basto", "2 de oro", "2 de copa"},
                            {"ancho de oro","ancho de copa"},
                            {"12 de espada","12 de basto", "12 de oro", "12 de copa"},
                            {"11 de espada","11 de basto", "11 de oro", "11 de copa"},
                            {"10 de espada","10 de basto", "10 de oro", "10 de copa"},
                            {"7 de basto", "7 de copa"},
                            {"6 de espada","6 de basto", "6 de oro", "6 de copa"},
                            {"5 de espada","5 de basto", "5 de oro", "5 de copa"},
                            {"4 de espada","4 de basto", "4 de oro", "4 de copa"}
    };
    int valor = 1;

        // Asigno valores de arriba a abajo
        for (String[] fila : deck) {
            // Obtener la primera carta de la fila y asignarle el valor
            fila[0] = Valor(fila[0], valor);
            valor++;
        }

        // Imprimo la matriz con los valores asignados
        for (String[] fila : deck) {
            System.out.println(Arrays.toString(fila));
        }

        // Pedir al usuario que elija una carta
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la carta: ");
        String cartaElegida = scanner.nextLine();

        // Buscar y mostrar el valor numérico de la carta elegida
        int valorCartaElegida = ObtenerValor(deck, cartaElegida);
        System.out.println("La carta " + cartaElegida + " tiene el valor: " + valorCartaElegida);
    }

    private static String Valor(String carta, int valor) {
        // Devuelvo solo el valor numérico
        return String.valueOf(valor);
    }

    private static int ObtenerValor(String[][] deck, String carta) {
        // Buscar la carta en la matriz y devolver su valor numérico
        for (int i = 0; i < deck.length; i++) {
            if (deck[i][0].equalsIgnoreCase(carta)) {
                return i + 1;
            }
        }
        return -1; // Valor de retorno para indicar que la carta no fue encontrada
    }
}