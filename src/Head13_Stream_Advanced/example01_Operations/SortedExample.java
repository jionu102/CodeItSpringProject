package Head13_Stream_Advanced.example01_Operations;

import java.util.Arrays;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 9);

        numbers.stream()
                .sorted() // 오름차순 정렬
                .forEach(num -> System.out.print(num + " "));
    }
}
