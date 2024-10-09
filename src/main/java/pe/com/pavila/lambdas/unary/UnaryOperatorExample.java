package pe.com.pavila.lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        /*
         * UnaryOperator
         * Recibe un valor lo procesa y devuelve un resultado del mismo tipo
         */

        UnaryOperator<Integer> unaryOperator = (number) -> number * number;
        System.out.println(unaryOperator.apply(5));
    }
}
