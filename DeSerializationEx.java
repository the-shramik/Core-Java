import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationEx {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("xxx.text");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employe e = (Employe) ois.readObject();

        System.out.println(e.id + " " + e.name);

    }
}
