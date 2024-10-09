package pe.com.pavila.lambdas.function;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        /*
         * Function
         * Recibe un valor y retorna un resultado
         */

        Function<Integer, String> function = (num) -> "El número es: " + num;
        System.out.println(function.apply(5));
    }
}
