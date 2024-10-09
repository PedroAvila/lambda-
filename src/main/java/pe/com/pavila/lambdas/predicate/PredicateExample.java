package pe.com.pavila.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        /*
         * Predicate
         * Recibe un valor y devulve un boleano
         */

        Predicate<String> predicate = (str) -> str.length() > 5;
        System.out.println(predicate.test("Hola Mundo"));

    }
}
