package Head13_Stream_Advanced.example02_Practice;

// 직접 구현해보기
// Hint, Person은 현재 2개의 필드만 존재함 ,
// 또한 출력 결과를 아래 결과처럼 구성하려면 Person 클래스 내에서 toString을 오버라이드 받아야함.
public class Person {
    // 코드
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}