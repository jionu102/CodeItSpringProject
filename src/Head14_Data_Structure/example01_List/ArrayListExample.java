package Head14_Data_Structure.example01_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println(list);
    }
}
