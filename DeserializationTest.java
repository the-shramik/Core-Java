import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("serialization.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person p = (Person) ois.readObject();

            System.out.println(p.age + " " + p.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
