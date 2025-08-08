package Head01_JavaPractice.example04;

import java.util.List;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        List<Integer> list = List.of(2, 4, 6, 8, 10);

        int[] scores = {1, 3, 5, 7, 9};

        for (Integer num : list) {
            System.out.println(num);
        }

        for (int num : scores) {
            System.out.println(num);
        }
    }
}