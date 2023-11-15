import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamEx1 {
    public static void main(String[] args) {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("guru.txt"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("shramik.txt"))) {

            int c;
            while ((c = bis.read()) != -1) {
                System.out.println((char) c);
                bos.write(c);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}