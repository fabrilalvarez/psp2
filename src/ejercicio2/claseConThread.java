package ejercicio2;

/**
 *
 * @author Fran Abril Alvarez
 */
public class claseConThread extends Thread {

    public void run() {
        // muestra 5 veces el nombre del hilo
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i + " " + getName());
                // se duerme el hilo durante 1s
                sleep(1000);
                System.out.println("Fin del thread" + getName());
            } catch (InterruptedException ex) {
                System.out.println("Hilo interrumpido");
            }
        }
    }

}
