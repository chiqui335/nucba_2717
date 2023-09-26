package Introduccion_Programacion.Semana6;
   public class letraAleat {
        public static void main (String[] args) {
            int a, b, c, d;
            int mayor;
            a= (int)(Math.random()*101);
            b= (int)(Math.random()*101);
            c= (int)(Math.random()*101);
            d= (int)(Math.random()*101);

            mayor=d;

            if (a>mayor){
                mayor=a;
            }
            if (b>mayor){
                mayor=b;
            }
            if (c>mayor){
                mayor=c;
            }
            System.out.println("los numeros generados son: " +a+" "+b+" "+c+" "+d);
            System.out.println("el mayor es: "+mayor);
        }
    }
