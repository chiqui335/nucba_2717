package Introduccion_Programacion.Semana6;

import java.util.Scanner;

public class Piedra_Papel_Tijera {
    public static void main (String [] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("haga su jugada: piedra(0), papel(1), tijeras(2)");

    //condicionales anidados
    if ((user==0 && pc==1) || (user==1 && pc==2) || (user==2 && pc==0)){
        System.out.println("la pc gana");
        user=sc.nextint();
    }
    else{
        if ((pc==0 && user==1) || (pc==1 && user==2) || (pc==2 && user==0)){
        System.out.println("El usuario gana");
        }
        else{
            System.out.println("Empate");
        }
    }        
  }
}
