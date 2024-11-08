package CUATRIMESTRE_3.Prog_avanzada.Clase19;

import java.util.LinkedList;
import java.util.Queue;

public class ColaPedidos {
    private Queue<Pizza> pedidos = new LinkedList<>(); //queue para almacenar los pedidos, queue es un tipo de coleccion
    private Object lock = new Object(); 
    private boolean pizzeriaAbierta = true;

    public void agregarPedido(Pizza pizza) {
        synchronized (lock) {
            pedidos.offer(pizza); // viene de queues, le digo que agregue la pizza a la queue
            System.out.println("nuevo pedido recibido: " + pizza);
            lock.notifyAll(); // "avisa a todos los hilos que estan esperando que hay un nuevo pedido"
        }
    }

    public Pizza tomarPedido() throws InterruptedException {
        synchronized(lock) { //evita que se ejecute en simultaneo el mismo hilo "que varios cocineros tomen el mismo pedido"
            while (pedidos.isEmpty() && pizzeriaAbierta) {
                lock.wait(); //cocinero, quedate esperando (esperá a algun tipo de accion)
            }

            if (pedidos.isEmpty() && !pizzeriaAbierta) {
                return null; //el cocinero se puede ir
            }
            return pedidos.poll(); //devuelve el primer elemento de la cola y lo elimina [remueve y retorna el primer pedido de la cola ]
        }
    }

    public void cerrarPizzeria() {
        synchronized (lock) {
            pizzeriaAbierta = false;
            lock.notifyAll(); //avisa a todos los hilos que estan esperando que la pizzeria se cierra
        }
    }
}
