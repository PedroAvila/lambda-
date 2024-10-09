package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // allMatch(): Verifica si todos los elementos cumplen la condición

        boolean result = names.stream()
                .allMatch((name) -> name.startsWith("A"));

        System.out.println(result);
    }
}
