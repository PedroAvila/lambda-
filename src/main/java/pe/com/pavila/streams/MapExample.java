package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // map(): Transforma los elementos aplicando una función

        names.stream()
                .map(String::toUpperCase)
                .filter((name) -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
