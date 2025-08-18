package Head10_Java_Collections_Framework.example03_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<String>();

        //요소 추가
        countries.add("Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea");

        //요소 포함 여부 확인
        System.out.println("Countries 'Japan' ?: " + countries.contains("Japan"));

        //요소 제거
        countries.remove("China");
        System.out.println("After remove 'China': " + countries);

        //개수 확인
        System.out.println(countries.size());

        //전체 제거
        countries.clear();
        System.out.println("After Clear: " + countries);
    }
}
