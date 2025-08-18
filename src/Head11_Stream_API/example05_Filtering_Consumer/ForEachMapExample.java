package Head11_Stream_API.example05_Filtering_Consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 75);
        scores.put("Park", 88);

        Consumer<Map.Entry<String, Integer>> consumer =
                new Consumer<Map.Entry<String, Integer>>() {
                    @Override
                    public void accept(Map.Entry<String, Integer> entry) {
                        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                    }
                };

        scores.entrySet().forEach(consumer);
    }
}
