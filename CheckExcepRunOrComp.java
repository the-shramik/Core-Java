import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExcepRunOrComp {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sss.txt");
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
    }
}
