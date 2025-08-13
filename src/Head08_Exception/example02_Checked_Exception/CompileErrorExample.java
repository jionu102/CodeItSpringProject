package Head08_Exception.example02_Checked_Exception;

import java.io.FileReader;

public class CompileErrorExample {
    public static void main(String[] args) {
        FileReader reader = new FileReader("test.txt"); // 컴파일 에러 발생
    }
}