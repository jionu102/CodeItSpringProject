package Head14_Data_Structure.example06_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 1000);
        map.put("orange", 2000);
        map.put("apple", 1200);

        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("orange"));
    }
}
