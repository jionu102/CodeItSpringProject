package Head08_Exception.example01_Unchecked_Exception;

public class RuntimeErrorExample {
    public static void main(String[] args) {
        int[] scores = {90, 80, 70};
        System.out.println(scores[3]); // 런타임 에러
    }
}