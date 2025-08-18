package Head11_Stream_API.example04_Filtering_Function;

import java.util.Arrays;
import java.util.List;

public class MapNamesExampleLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .map(s -> s.length())
                .forEach(System.out::println);
    }
}
