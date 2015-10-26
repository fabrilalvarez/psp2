/**
 * Programa que crea 4 hilos, los ejecuta y espera a que estos terminen. Los
 * hilos escriben 5 veces el número de iteración del bucle y su nombre. En cada
 * iteración, después de escribir su nombre, se bloquean durante un segundo y
 * vuelven a estar disponibles para su ejecución. 
 */
package ejercicio2;

/**
 *
 * @author Fran Abril Alvarez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crean dos hilos con claseConThread.
        claseConThread primera = new claseConThread();
        claseConThread segunda = new claseConThread();
        // se ejecuta el hilo.
        primera.start();
        segunda.start();
    }

}
