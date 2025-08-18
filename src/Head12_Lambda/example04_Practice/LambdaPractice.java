package Head12_Lambda.example04_Practice;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 1. Consumer
        // 1.1 익명 클래스
//        Consumer<String> print = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        names.forEach(print);

        // 1.2 람다
//        names.forEach(s -> System.out.println(s));

        // 1.3 참조형
        names.forEach(System.out::println);





        // 2. Predicate - 이름 길이 5 이상 필터링
//        Predicate<String> lengthCheck = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() >= 5;
//            }
//        };
//        names.stream().filter(lengthCheck).forEach(System.out::println);
        //2.1 람다 + 참조
        names.stream().filter(s -> s.length() >= 5).forEach(System.out::println);





        // 3. Function - 이름을 대문자로 변환
        // 3.1 익명 클래스
//        Function<String, String> toUpper = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        };
//        names.stream().map(toUpper).forEach(System.out::println);
        // 3.2 람다
//        names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        // 3.3 참조
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
