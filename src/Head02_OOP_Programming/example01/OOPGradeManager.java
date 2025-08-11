package Head02_OOP_Programming.example01;

class Student {
    //접근 지정자를 명시하지 않을 경우 default(같은 패키지에서만 접근 가능)가 적용
    String name;
    int mathScore;
    int engScore;

    public Student(String name, int mathScore, int engScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    double getAverage() {
        return (mathScore + engScore) / 2.0;
    }
}

public class OOPGradeManager {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 90, 95),
                new Student("Bob", 80, 75),
                new Student("Charlie", 85, 88)
        };

        for (Student student : students) {
            System.out.printf("%s 평균: %.1f\n", student.name, student.getAverage());
        }
    }
}
