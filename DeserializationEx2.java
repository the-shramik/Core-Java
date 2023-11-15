import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationEx2{
    public static void main(String[] args) throws Exception{

     
        FileInputStream fis = new FileInputStream("emp.text");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee emp = (Employee) ois.readObject();

        System.out.println(emp.id + " " + emp.name);
            
      

    }
}