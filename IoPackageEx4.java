import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoPackageEx4 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("DYP.txt");
                FileOutputStream fos = new FileOutputStream("SANDWITCH.txt")) {

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
