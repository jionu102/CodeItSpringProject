package Head08_Exception.example02_Checked_Exception;

import java.io.FileReader;
import java.io.IOException;

public class CompileErrorExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("test.txt"); // 컴파일 에러 발생
    }
}