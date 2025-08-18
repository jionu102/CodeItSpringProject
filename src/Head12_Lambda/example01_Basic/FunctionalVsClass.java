package Head12_Lambda.example01_Basic;

class Greeter {
    private final String prefix; // 상태를 가질 수 있음

    public Greeter(String prefix) {
        this.prefix = prefix;
    }

    public void greet(String name) { // 메서드 여러개 가능
        System.out.println(prefix + " " + name);
    }
}

@FunctionalInterface
interface StringAction {
    // 추상 메서드가 단 하나만 있어야 함수형 인터페이스 성립
    void run(String input);

    // default/static 메서드는 몇 개 있어도 상관 없음 -> 메서드 숫자에 카운트되지 않음
    default void info() {
        System.out.println("[Info] StringAction default method");
    }
    static void help() {
        System.out.println("[Help] This is a helper.");
    }
}

// 컴파일 에러 유도 코드 (주석처리 후 실행)
//@FuncionalInterface
//interface Broken {
//    void a();
//    void b();
//}

public class FunctionalVsClass {
    public static void main(String[] args) {
        Greeter greeter = new Greeter("Hello");
        greeter.greet("Lee");

        StringAction stringAction = new StringAction() {
            @Override
            public void run(String input) {
                System.out.println(input.toUpperCase());
            }
        };

        StringAction stringAction1 = s -> System.out.println(s.toUpperCase());

        stringAction.run("hello");
        stringAction1.run("hello");
    }
}
