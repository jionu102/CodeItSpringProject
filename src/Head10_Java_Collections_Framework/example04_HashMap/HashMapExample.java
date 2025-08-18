package Head10_Java_Collections_Framework.example04_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        //키-값 쌍 추가
        map.put("Kim", 90);
        map.put("Lee", 85);
        map.put("Park", 95);
        System.out.println("After Put: " + map);

        //기존 키에 다른 값 할당
        map.put("Lee", 88);
        System.out.println("After Updating 'Lee': " + map.get("Lee"));

        //특정 키의 값 조회
        int park = map.get(("Park"));
        System.out.println("'Park' Score: " + park);

        //키 존재 여부
        System.out.println("Contains Key 'Kim' ?: " + map.containsKey("Kim"));

        //요소 제거
        map.remove("Kim");
        System.out.println("After Remove 'Kim': " + map);

        //모든 키 조회
        System.out.println("All Keys: " + map.keySet());
    }
}
