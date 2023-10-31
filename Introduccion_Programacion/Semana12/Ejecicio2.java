package Introduccion_Programacion.Semana12;

public class Ejecicio2 {
    public static void main(String[] args){
        String names[] = {"boris", "pablo", "andy", "Spock"};

        int n = names.length;

        String nomAct, nomNext;
        char inicAct, inicNext;
        for (int i = 0; i < n - 1; i++){
            Boolean Swap = false;
            for (int j = 0; j < n - i - 1; j++){
                nomAct = names[j];
                nomNext = names[j + 1];

                // Al comparar solo el primer carácter, 'S' de "Spock" 
                // es menor en valor ASCII que 'a' de "andy" y 'b' de "boris", 
                // y por eso "Spock" se coloca antes en la secuencia ordenada.
                
                inicAct = nomAct.charAt(0);
                inicNext = nomNext.charAt(0);
                if (inicAct > inicNext){
                    String tempSw = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = tempSw;
                    Swap = true;
                }
                
            }
            if (!Swap) {
                    break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " ");
        }
    }
}

//FORMA CORRECTA CON EL compareTo()
// public class Ejercicio2 {
//     public static void main(String[] args) {
//         String names[] = {"boris", "pablo", "andy", "Spock"};

//         int n = names.length;

//         for (int i = 0; i < n - 1; i++) {
//             boolean swap = false;
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (names[j].compareTo(names[j + 1]) > 0) { ACA
//                     String tempSw = names[j + 1];
//                     names[j + 1] = names[j];
//                     names[j] = tempSw;
//                     swap = true;
//                 }
//             }
//             if (!swap) {
//                 break;
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             System.out.print(names[i] + " ");
//         }
//     }
// }
