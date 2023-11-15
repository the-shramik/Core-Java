import java.util.Properties;
import java.io.FileInputStream;

public class PropertyEx {
    public static void main(String[] args) {

        try {

            // load the properties file
            FileInputStream fis = new FileInputStream("abc.properties");
            Properties pr = new Properties();

            pr.load(fis);

            // read the data from properties
            System.out.println(pr.getProperty("username"));
            System.out.println(pr.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
