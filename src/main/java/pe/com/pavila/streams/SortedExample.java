package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class SortedExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // sorted(): Ordena los elementos de un string

        names.stream()
                .sorted()
                .forEach(System.out::println);
    }

}
