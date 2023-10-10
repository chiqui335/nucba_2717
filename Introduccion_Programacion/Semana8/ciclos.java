package Introduccion_Programacion.Semana8;

//Ejercicio con while
public class ciclos {
    public static void main(String[] args) {
        int contPares = 0;
        int X = 0;
        while (X!=37) {
            X = (int)(Math.random()*51);
            if (X%2==0){
                System.out.println("Salio " + X + " que es par");
                contPares++;
            }
        }
        System.out.println("Salio el 37, se contaron " + contPares + " numeros pares");

    }
}
