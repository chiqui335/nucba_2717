package Introduccion_Programacion.Semana11_2;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //inicio el array con los valores
        int [] nums = {62, 0, 67, 77, 40, 56, 62, 0, 49, 42, 67, 8, 67};

        //Inicio las variables 
        int Mayor = nums[0];
        int Minor = nums[0];

        //con el for busco el mayor y el menor del array
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > Mayor){
                Mayor = nums[i];
            }       
            if (nums[i] < Minor){
                Minor = nums[i];
         }
        
        int Suma = 0; //variable para ayudarme

        //Busco el promedio

         for (int p = 0; i < nums.length; i++) {
            Suma += nums[i];
        }
        double prom = (double)Suma / nums.length;


        //inicio un scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número para contar cuántas veces aparece en el array: ");
        int userNum = sc.nextInt();

        int contador = 0;
        for (int b = 0; b < nums.length; b++) {
            if(userNum == nums[b]) {
            contador++;
            }
        }

        System.out.println("el numero mayor en el vector es: "+Mayor);
        System.out.println("el numero menor en el vector es: "+Minor);
        System.out.println("El promedio de los numeros del vector es: "+prom);
        System.out.println(userNum+" esta "+contador+" veces en el array");

        sc.close();
    }
  }
}
