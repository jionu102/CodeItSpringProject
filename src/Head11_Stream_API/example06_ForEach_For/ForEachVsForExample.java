package Head11_Stream_API.example06_ForEach_For;

import java.util.Arrays;
import java.util.List;

public class ForEachVsForExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("=== Using For Loop ===");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                continue;
            }
            System.out.println("Even Number: " + numbers.get(i));
        }

        System.out.println("=== Using Enhanced For ===");
        for (Integer number : numbers) {
            if  (number % 2 != 0) {
                continue;
            }
            System.out.println("Even Number: " + number);
        }

        System.out.println("=== Using Stream Filter + ForEach ===");
        numbers.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.println("Even Number: " + num));
    }
}
