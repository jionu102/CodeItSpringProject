package Head16_File_IO.example01_Reader_Writer;

import java.io.*;
import java.util.Scanner;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader("./src/resources/input.txt"))) {
            String line;

            while ((line =  br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/resources/output.txt"))) {
            String line = in.nextLine();
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
