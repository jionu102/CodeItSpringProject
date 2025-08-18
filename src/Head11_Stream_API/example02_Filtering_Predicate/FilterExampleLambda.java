package Head11_Stream_API.example02_Filtering_Predicate;

import java.util.Arrays;
import java.util.List;

public class FilterExampleLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
