import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoPackageEx3 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("MCA.txt");
                FileOutputStream fos = new FileOutputStream("DYP.txt")) {

            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
                fos.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
