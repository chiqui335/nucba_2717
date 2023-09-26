package Introduccion_Programacion.Semana6;

public class numeromenor {
    public static void main (String [] args) {
        int a, b, c;
        int menor;
        a= (int)(Math.random()*101);
        b= (int)(Math.random()*101);
        c= (int)(Math.random()*101);

        menor=c;

        if (a<menor){
            menor=a;
        }
        if (b<menor){
            menor=b;
        }
        System.out.println("los numeros generados son: " +a+" "+b+" "+c);
        System.out.println("el menor es: "+menor);
    }
}
