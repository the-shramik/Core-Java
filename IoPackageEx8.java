import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IoPackageEx8 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\dj.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\gg.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
