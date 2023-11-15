import java.io.FileInputStream;
import java.io.FileOutputStream;
// import java.io.FileNotFoundException;

public class IoPackageEx {
  public static void main(String[] args) {

    try (FileInputStream fis = new FileInputStream("abc.txt"); FileOutputStream fos = new FileOutputStream("xyz.txt")) {
      int c;
      while ((c = fis.read()) != -1) {
        System.out.println((char) c);
        fos.write(c);
      }
    } catch (Exception fe) {
      fe.printStackTrace();
    }
  }
}