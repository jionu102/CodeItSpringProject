package Head10_Java_Collections_Framework.example05_StudentManagement;

import java.util.*;

public class StudentManager {
    private List<Student> students;
    private Set<String> names;
    private Map<String, Integer> scores;

    public StudentManager(){
        students = new ArrayList<>();
        names = new HashSet<>();
        scores = new HashMap<>();
    }

    public void addStudent(Student student, int score){
        if (names.contains(student.getName())){
            System.out.println("[Error] 이미 존재하는 이름입니다.");
            return;
        }

        students.add(student);
        names.add(student.getName());
        scores.put(student.getName(), score);
        System.out.println("[Info] 새로운 학생이 등록되었습니다: " + student);
    }

    public void removeStudent(String name){
        Student target = null;

        for (Student s : students) {
            if (s.getName().equals(name)){
                target = s;
                break;
            }
        }

        if (target != null){
            students.remove(target);
            names.remove(target.getName());
            scores.remove(target.getName());
            System.out.println("[Info] 학생이 삭제되었습니다: " + target);
        } else {
            System.out.println("[Error] 학생을 찾을 수 없습니다.");
        }
    }

    public void printAllStudents(){
        System.out.println("===== 학생 목록 =====");
        for (Student s : students){
            System.out.println(s);
        }
    }

    public void printScore(String name){
        Integer score = scores.get(name);

        if (score != null){
            System.out.println("[Info] " + name + "의 점수: " + score);
        } else {
            System.out.println("[Error] 점수를 찾을 수 없습니다.");
        }
    }
}
