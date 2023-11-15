import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class IoPackageEx6 {
    public static void main(String[] args) {
        try (FileOutputStream fos1 = new FileOutputStream("f1.txt");
                FileOutputStream fos2 = new FileOutputStream("f2.txt");
                ByteArrayOutputStream b1 = new ByteArrayOutputStream();) {

            String str = "hello guys";

            byte[] b = str.getBytes();

            b1.write(b);
            b1.writeTo(fos1);
            b1.writeTo(fos2);

            System.out.println("finished!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
