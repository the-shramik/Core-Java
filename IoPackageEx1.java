import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoPackageEx1 {
    public static void main(String[] args) {
        // ***********Regular Code***********
        // creating a byte oriented channel(we can work with byte formatted data)
        // FileInputStream fis = null;
        // FileOutputStream fos = null;

        // ***********Optimized Code(Try with resoucres)***********
        try (FileInputStream fis = new FileInputStream("D:\\abc.txt");
                FileOutputStream fos = new FileOutputStream("D:\\xyz.txt")) {

            // ***********Regular Code***********
            // reading the data using FileInputStream stream
            // fis = new FileInputStream("D:\\abc.txt");

            // reading the data using FileOutputStream stream
            // fos = new FileOutputStream("D:\\xyz.txt");

            // ***********Optimized Code(Using byte array)***********

            byte[] buffer = new byte[1024];
            int c;

            while ((c = fis.read(buffer)) != -1) {
                System.out.write(buffer, 0, c);
                fos.write(buffer, 0, c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // finally {
        // try {
        // fis.close();
        // fos.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // }

    }
}
