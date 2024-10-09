package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // forEach(): Aplica una acción a cada elemento

        names.stream()
                .forEach((name) -> {
                    // Consultas e inserciones a la base de datos
                });

    }

}
