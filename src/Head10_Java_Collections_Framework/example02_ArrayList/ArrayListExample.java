package Head10_Java_Collections_Framework.example02_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        //요소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After add:  " + fruits);

        //인덱스를 통한 접근
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        //요소 삭제
        fruits.remove(1);
        System.out.println("After remove index 1: " + fruits);

        //개수 확인
        System.out.println("List Size: " + fruits.size());

        //전체 제거
        fruits.clear();
        System.out.println("After clear: " + fruits);
    }
}
