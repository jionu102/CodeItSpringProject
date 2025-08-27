package Head16_File_IO.example02_CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvToMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader("./src/resources/stock.csv"))) {
            String line;
            boolean header = true;
            while((line = br.readLine()) != null){
                String[] tokens = line.split(",");
                if (header) {
                    System.out.println(tokens[0] + "," +  tokens[1]);
                    header = false;
                    continue;
                }
                System.out.println(tokens[0] + "," +  tokens[1]);
                map.put(tokens[0], Integer.parseInt(tokens[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(map.toString());
    }
}
