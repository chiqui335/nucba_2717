package Introduccion_Programacion.Semana12;

public class ejemplo1__BUBBLESORT {
    public static void main(String[] args){
        // int n = arreglo.length;
    //     for (int i = 0; i < n - 1; i++) { i: ES EL CICLO EXTERNO; Se incrementa SOLO despues de que el ciclo j haga un ciclo
    //         for (int j = 0; j < n - i - 1; j++) { j: es EL CICLO INTERNO; SE EJECUTA MIENTRAS EL TAMAÑO (n) SEA MENOR QUE EL TAMAÑO DE i MENOS 1
    //             if (arreglo[j] > arreglo[j + 1]) { SI EL NUMERO ACTUAL ES MAYOR QUE EL SIGUIENTE SE HACE EL SWAP
    //                      Intercambiar elementos si están en el orden incorrecto
    //                 int temp = arreglo[j];
    //                 arreglo[j] = arreglo[j + 1];
    //                 arreglo[j + 1] = temp;
    //             }
    //         }
    //     }

        
        int numeros[] = {31, 12, 41, 49, 19, 55, 10};
        int n = numeros.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                int act = numeros[j];
                int sig = numeros[j + 1];
                if(act>sig){
                    int tempSw=numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j]= tempSw;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
    
}

