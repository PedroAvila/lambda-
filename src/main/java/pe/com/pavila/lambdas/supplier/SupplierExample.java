package pe.com.pavila.lambdas.supplier;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        /*
         * Supplier
         * No recibe ningún valor, pero retorna un resultado
         */

        Supplier<String> supplier = () -> "Hola soy un Supplier";
        System.out.println(supplier.get());
    }

}
