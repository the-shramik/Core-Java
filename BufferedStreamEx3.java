import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamEx3 {
    public static void main(String[] args) {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("DYP.txt"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("JAVA.txt"))) {

            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
                bos.write(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
