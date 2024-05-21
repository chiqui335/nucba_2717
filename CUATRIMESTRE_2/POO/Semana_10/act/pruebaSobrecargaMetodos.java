package CUATRIMESTRE_2.POO.Semana_10.act;

public class pruebaSobrecargaMetodos {
    public static void main(String[] args) {
        SobrecargaMetodos sm = new SobrecargaMetodos();
        
        System.out.println("El resultado de multiplicar 3 y 4 es: " + sm.multiplicar(3, 4));
        System.out.println("El resultado de multiplicar 3.0 y 4.0 es: " + sm.multiplicar(3.0, 4.0));
        System.out.println("El resultado de multiplicar 3, 4 y 5 es: " + sm.multiplicar(3, 4, 5));
        
        // Demostración de la sobrescritura del método toString()
        System.out.println(sm.toString());
    }
}

