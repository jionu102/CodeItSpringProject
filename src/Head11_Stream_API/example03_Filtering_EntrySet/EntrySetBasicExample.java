package Head11_Stream_API.example03_Filtering_EntrySet;

import java.util.HashMap;
import java.util.Map;

public class EntrySetBasicExample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Korea", "Seoul");
        map.put("USA","Washington D.C.");
        map.put("Japan", "Tokyo");

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", capital: " + entry.getValue());
        }
    }
}
