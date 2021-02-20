package streams.example1;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        //Streams represent sequence of elements.
        //Common operations of stream map, filter, foreeach, etc..
        //elements in the stream cannot be changed.

        List<String> colors = Arrays.asList("Red", "Green", "White", "Black", "Blue");

        colors.stream().sorted().findFirst().ifPresent(System.out::println);
        //streamas sukurtas is listo


        //streamas sukurtas naudojant Stream klase
        Stream.of("Apple", "Cherry","Bannana", "Potato", "Burokel")
                .filter(fruit -> fruit.startsWith("B"))
                .forEach(fruit -> System.out.println("Starts with letter B fruit: " + fruit));

        List<String> words = Stream.of("Java", "Table", "Chair", "Bannana")
                .map(string -> string.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(words);

        //Primitive streams, forEach uses consumer

        IntStream.range(1,10).forEach(skaicius -> System.out.println(skaicius));
    }
}
