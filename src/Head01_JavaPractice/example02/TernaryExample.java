package Head01_JavaPractice.example02;

public class TernaryExample {
    public static void main(String[] args) {
        int score = 89;
        String result = (score >= 90) ? "A학점" : "B학점";
        System.out.println("성적: " + result);
    }
}