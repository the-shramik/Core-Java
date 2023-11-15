import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {
    public static void main(String[] args) throws Exception {
        try {
            Employe e = new Employe(111, "Shramik");
            FileOutputStream fis = new FileOutputStream("xxx.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fis);

            oos.writeObject(e);
            System.out.println("Serialization completed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
