package Head01_JavaExample.example05;

import java.util.Arrays;

public class DeepCopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

//      System.arraycopy(original, 0, copy, 0, original.length);
//        original - 복사할 원본 배열
//        0 - 원본 배열의 시작 인덱스 (어디서부터 복사할지)
//        copy - 복사될 대상 배열
//        0 - 대상 배열의 시작 인덱스 (어디에 붙여넣을지)
//        original.length - 복사할 요소의 개수

        copy[0] = 100;

        System.out.println(original[0]);
        System.out.println(Arrays.equals(copy, original)); //배열 요소 비교, 동등 연산(==)은 주소를 비교함
    }
}
