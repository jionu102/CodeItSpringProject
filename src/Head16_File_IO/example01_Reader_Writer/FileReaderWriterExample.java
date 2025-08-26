package Head16_File_IO.example01_Reader_Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("./src/resources/output.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter("./src/resources/input.txt")) {
            String content = "File Output";
            for (char c : content.toCharArray()) {
                fw.write(c);
            }

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
