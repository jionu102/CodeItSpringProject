package Head11_Stream_API.example05_Filtering_Consumer;

import java.util.ArrayList;
import java.util.List;

public class ForEachFruitsExampleLambda {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.forEach(fruit -> System.out.println("Fruit: " + fruit));
    }
}
