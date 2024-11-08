package CUATRIMESTRE_3.Prog_avanzada.Clase19;

import java.util.Random;

public class Cocinero implements Runnable{
    private String nombre;
    private ColaPedidos cortoPedidos;
    private Random random = new Random();

    public Cocinero(String nombre, ColaPedidos cortoPedidos) {
        super();
        this.nombre = nombre;
        this.cortoPedidos = cortoPedidos;
    }

    public void prepararPizza(Pizza pizza) throws InterruptedException{ 
        System.out.println(nombre + " comienza a preparar: " + pizza);

        Thread.sleep (1000 + random.nextInt(1000));
        System.out.println(nombre + " esta amasando la pizza " + pizza.getNumeroOrden());

        Thread.sleep (1000 + random.nextInt(1000)); // ESTO NO SE HACE, ACA SE HACE PARA SIMULAR EL PREPARADO DE LA PIZZA
        System.out.println(nombre + " esta añadiendo los ingredientes a la pizza " + pizza.getNumeroOrden());

        Thread.sleep (2000 + random.nextInt(1000));
        System.out.println(nombre + " esta horneando la pizza " + pizza.getNumeroOrden());

        System.out.println(nombre + " ha terminado la pizza " + pizza.getNumeroOrden());
    }

    
    @Override
    public void run() {
        try {
            while(true) {
                Pizza pizza = cortoPedidos.tomarPedido();
                
                if (pizza == null){
                    System.out.println(nombre + " ha terminado su turno");  //bucle infinito donde se toman los pedidos y se preparan si pizza == null significa que la pizzeria esta cerrada entonces el cocinero se las toma
                    break;                                                  //si salta una excepcion se interrumpe el hilo com Thread.currentThread().interrupt();
                }
                prepararPizza(pizza);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
}
