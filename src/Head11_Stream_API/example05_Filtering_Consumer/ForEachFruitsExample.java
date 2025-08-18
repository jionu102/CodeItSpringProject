package Head11_Stream_API.example05_Filtering_Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachFruitsExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Consumer<String> printConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Fruit: " + s);
            }
        };

        fruits.forEach(printConsumer);
    }
}
