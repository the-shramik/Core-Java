import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("serialization.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(new Person(22, "Shramik"));
            System.out.println("serialization completed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
