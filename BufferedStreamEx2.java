import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedStreamEx2 {

   public static void main(String[] args) {

      try (BufferedReader br = new BufferedReader(new FileReader("shramik.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("guru.txt"))) {

         String line;

         while ((line = br.readLine()) != null) {
            System.out.println(line);
            bw.write(line);
            bw.newLine();
         }

      } catch (IOException ie) {
         ie.printStackTrace();
      }
   }
}
