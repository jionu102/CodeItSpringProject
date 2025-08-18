package Head12_Lambda.example03_Method_Reference;

import java.util.function.Function;

public class StaticMethodRefDemo {
    public static int doubleValue(int x) {
        return x * 2;
    }
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = num -> StaticMethodRefDemo.doubleValue(num);

        Function<Integer, Integer> f2 = StaticMethodRefDemo::doubleValue;

        System.out.println(f2.apply(10));
        System.out.println(f1.apply(10));
    }
}
