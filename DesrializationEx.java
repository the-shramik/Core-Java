import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesrializationEx {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\serilized.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Employee emp = (Employee) ois.readObject();

            System.out.println(emp.id + " " + emp.name + " " + emp.salary);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
