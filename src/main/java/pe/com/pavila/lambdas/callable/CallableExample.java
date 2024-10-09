package pe.com.pavila.lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {

    public static void main(String[] args) {

        /*
         * Callable
         * No recibe valores, pero retorna un resultado y puede lanzar una excepción
         */

        Callable<String> callable = () -> "Resultado de la tarea...";
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
