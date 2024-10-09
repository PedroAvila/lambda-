package pe.com.pavila.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // reduce(): Combina todos los elementos en un solo valor

        var result = names.stream()
                .reduce("", (a, b) -> a.concat(" ").concat(b));

        System.out.println(result);
    }

}
