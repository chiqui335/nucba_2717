package CUATRIMESTRE_3.Prog_avanzada.Clase18;

public class MiThread extends Thread {
    public void run(){
        for (int i = 0; i <= 5; i++){
            System.out.println("Soy el hilo 1 iteración " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrupted");
            }
        }
    }
}
