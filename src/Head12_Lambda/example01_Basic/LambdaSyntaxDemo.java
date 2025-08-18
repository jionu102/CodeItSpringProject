package Head12_Lambda.example01_Basic;

@FunctionalInterface
interface Calculator {
    int operate(int x, int y);
}

public class LambdaSyntaxDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;

        Calculator sub = (a, b) -> {
            System.out.println("subjecting...");
            return a - b;
        };

        Calculator multiply = (a, b) -> a * b;

        Calculator divide = (a, b) -> a / b;

        System.out.println("2 + 3 = " + add.operate(2, 3));
        System.out.println("2 - 3 = " + sub.operate(2, 3));
        System.out.println("2 * 3 = " + multiply.operate(2, 3));
        System.out.println("2 / 3 = " + divide.operate(2, 3));
    }
}
