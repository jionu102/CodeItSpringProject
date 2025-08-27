package Head17_Serializable.example01_Object_Read_Write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteExample {
    public static void main(String[] args) {
        User user = new User("Alice", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/resources/user.ser"))) {
            oos.writeObject(user);
            System.out.println("직렬화 완료: user.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
