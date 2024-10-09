package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class CollectExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // collect(): Recoje los elementos de una collección
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .toList(); // Apartir de java 16
        // .collect(Collectors.toList());

        result.stream().forEach(System.out::println);
    }
}
