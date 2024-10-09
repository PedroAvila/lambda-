package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // anyMatch(): Verifica si algún elemento cumple una condición

        boolean result = names.stream()
                .anyMatch((name) -> name.startsWith("J"));

        System.out.println(result);
    }
}
