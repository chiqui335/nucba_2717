package Introduccion_Programacion.Semana12;

public class Ejercicio1 {
    public static void main(String[] args) {
        double prices[]={4.31, 0.31, 1.27, 5.55, 3.49, 1.09};

        int n = prices.length;

        for (int i = 0; i < n - 1; i++) {
            Boolean Swap = false; //flag para indicar si hubo swap de los valores del array o no
            for (int j = 0; j < n - i - 1; j++) {
                double act = prices[j];
                double next = prices[j + 1];
                if (act>next) {
                    double tempSw = prices[j + 1];
                    prices[j + 1] = prices[j];
                    prices[j] = tempSw;
                    Swap = true; // Se realiza el intercambio, cambiamos el flag a true
                }
                if(!Swap) {
                    break; // Si no se ha realizado ningún intercambio, el arreglo ya está ordenado
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }
    }
}
