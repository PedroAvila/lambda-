package pe.com.pavila.lambdas.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        /*
         * BiPredicate
         * Recibe dos valores y devuelve un boleano
         */

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(10, 5));
    }
}
