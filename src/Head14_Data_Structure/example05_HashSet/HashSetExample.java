package Head14_Data_Structure.example05_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("apple");

        System.out.println(set.contains("banana"));
        System.out.println(set.size());
        System.out.println(set);
    }
}
