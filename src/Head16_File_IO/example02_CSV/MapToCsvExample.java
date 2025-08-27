package Head16_File_IO.example02_CSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToCsvExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("orange", 20);
        map.put("pear", 30);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/resources/stock.csv"))) {
            bw.write("item,quantity");
            bw.newLine();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                bw.write(entry.getKey() + "," +  entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
