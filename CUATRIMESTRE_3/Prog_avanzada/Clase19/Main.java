package CUATRIMESTRE_3.Prog_avanzada.Clase19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ColaPedidos colaPedidos = new ColaPedidos();
        Random random = new Random();
    
        String[] tiposPizza = {
            "Margarita", "Morron con jamon", "Pepperoni", 
            "Napolitana", "Rellena", "Rucula", "Provoleta",
            "Muzzarella"
        };

        List<Thread> cocineros = new ArrayList<>();
        for (int i = 0; i <= 3; i++) { //hasta 4 cocineros
            Thread cocinero = new Thread(new Cocinero("Cocinero " + i, colaPedidos)); //Se crea un nuevo hilo cocinero
            cocineros.add(cocinero);            //simulo que tengo muchos cocineros al mismo tiempo (trabajando en paralelo)
            cocinero.start();
        }

        System.out.println("La pizzeria esta abrierta");

        for (int i = 0; i <= 10; i++) {
            String tipoPizza = tiposPizza[random.nextInt(tiposPizza.length)];
            Pizza pizza = new Pizza(tipoPizza, null, i);

            colaPedidos.agregarPedido(pizza);

            Thread.sleep(random.nextInt(2000));

            System.out.println("La pizzeria esta cerrada");
            colaPedidos.cerrarPizzeria();

            for(Thread cocinero : cocineros){
                cocinero.join(); //Espero a que todos los cocineros terminen su trabajo
            }

            System.out.println("Todos los cocineros han terminado su trabajo");
        }

    }
}
