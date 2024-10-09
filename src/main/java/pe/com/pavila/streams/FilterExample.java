package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // filter(): Filtra los elementos que cumplen una condición

        names.stream().filter((name) -> name.length() > 4)
                .forEach(System.out::println);

    }
}
