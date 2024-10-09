package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class LimitExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // limit(): Limita el número de elementos procesados
        names.stream()
                .limit(2)
                .forEach(System.out::println);
    }
}
