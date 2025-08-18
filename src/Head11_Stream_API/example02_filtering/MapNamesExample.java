package Head11_Stream_API.example02_filtering;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MapNamesExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 == 0;
                    }
                })
                .forEach(System.out::println);
    }
}
