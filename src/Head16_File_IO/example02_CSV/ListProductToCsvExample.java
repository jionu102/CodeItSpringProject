package Head16_File_IO.example02_CSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ListProductToCsvExample {
    static class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/resources/products.csv"))) {
            bw.write("id,name,price");
            bw.newLine();
            Product[] products = new Product[] {
                    new Product(4, "Carrot", 500),
                    new Product(5, "Potato", 100),
                    new Product(6, "Pear", 10000),
            };

            for (Product p :  products) {
                bw.write(p.getId() + "," + p.getName() + "," + p.getPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
