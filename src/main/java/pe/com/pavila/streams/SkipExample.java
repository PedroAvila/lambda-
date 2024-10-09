package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class SkipExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // skip(): Omite un número especifico de elementos

        names.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
