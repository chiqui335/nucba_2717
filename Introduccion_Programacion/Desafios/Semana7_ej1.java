package Introduccion_Programacion.Desafios;

public class Semana7_ej1 {
    public static void main(String[] args){

        int Intervalo1 = 0;
        int Intervalo2 = 0;
        int Intervalo3 = 0;
        int Intervalo4 = 0;
        for (int i = 0; i < 100; i++) {
            int numAleatorio = (int)(Math.random() * 100) + 1;
            
            if(numAleatorio >=0 && numAleatorio <= 25){
                Intervalo1++;
            }else if (numAleatorio > 25 && numAleatorio <= 50){
                Intervalo2++;
            }else if (numAleatorio > 50 && numAleatorio <= 75){
                Intervalo3++;
            }else if (numAleatorio > 75 && numAleatorio <= 100){
                Intervalo4++;
            }
          }
          System.out.println(Intervalo1);
          System.out.println(Intervalo2);
          System.out.println(Intervalo3);
          System.out.println(Intervalo4);
    }
}
