import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}

public class SerializationEx1 {
    public static void main(String[] args) {
        Employee emp = new Employee(111, "guru", 76956.53);
        try (FileOutputStream fos = new FileOutputStream("D:\\serilized.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(emp);
            System.out.println("Serialization completed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
