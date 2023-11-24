import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoPackageEx7 {
    public static void main(String[] args) {

        // creating buffer stream to increase performance
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\mz.txt"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\dj.txt"))) {

            byte[] buffer = new byte[1024];
            int c;
            while ((c = bis.read(buffer)) != -1) {
                System.out.write(buffer, 0, c);
                bos.write(buffer, 0, c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
