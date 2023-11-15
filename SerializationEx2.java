import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class Employee implements Serializable{
    int id;
    String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}

public class SerializationEx2{
    public static void main(String[] args){

          try{
            Employee e=new Employee(111,"shramik");

            FileOutputStream fos=new FileOutputStream("emp.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeObject(e);

            System.out.println("serialization is completed!");

          }
          catch(IOException ie){
            ie.printStackTrace();
          }
    }
}