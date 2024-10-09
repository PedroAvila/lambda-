package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // noneMatch(): Verifica si ningún elemento cumple la condición

        var result = names.stream()
                .noneMatch((name) -> name.length() == 10);
        System.out.println(result);
    }
}
