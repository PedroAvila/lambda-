package pe.com.pavila.lambdas.runnable;

public class RunnableExample {

    public static void main(String[] args) {

        /*
         * Runnable
         * No recibe valores y no retorna nada, solo ejecuta una tarea
         */

        Runnable runnable = () -> System.out.println("Ejecurtando tarea...");
        runnable.run();
    }
}
