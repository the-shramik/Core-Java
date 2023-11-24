import java.io.FileReader;
import java.io.FileWriter;

public class IoPackageEx5 {
    public static void main(String[] args) {
        // Creting a charcter oriented channel

        // ***********Regular Code***********
        // FileReader fr = null;
        // FileWriter fw = null;

        // ***********Optimized Code(using try-resources)***********
        try (FileReader fr = new FileReader("D:\\xyz.txt");
                FileWriter fw = new FileWriter("D:\\mz.txt");) {

            // ***********Regular Code***********
            // fr = new FileReader("D:\\xyz.txt");
            // fw = new FileWriter("D:\\mz.txt");

            // ***********Optimized Code(using try-resources)***********
            char[] buffer = new char[1024];
            int c;

            while ((c = fr.read(buffer)) != -1) {
                System.out.println(buffer);
                fw.write(buffer, 0, c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // ***********Regular Code***********
        // finally {
        // try {
        // fr.close();
        // fw.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // }
    }
}
