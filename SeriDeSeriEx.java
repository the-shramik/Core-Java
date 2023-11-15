import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class  SeriDeSeriEx{

    public void serialization(){
          
        Emp e= new Emp(11,"Guru");
        try{
        FileOutputStream fos=new FileOutputStream("aaa.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e);
        System.out.println("Serialization completed!");

        }
        catch(IOException i){
            i.printStackTrace();
        }
       
    }

    public void desrialization(){
        try{
           FileInputStream fis=new FileInputStream("aaa.txt");
           ObjectInputStream ois=new ObjectInputStream(fis);
           Emp e=(Emp)ois.readObject();

           System.out.println(e.id+" "+e.name);
        }
        catch(IOException i){
            i.printStackTrace();
        }
         catch(ClassNotFoundException c){
            c.printStackTrace();
        }
    }
    public  static void main(String[] args){
         
         SeriDeSeriEx sde=new SeriDeSeriEx();
         sde.serialization();
         sde.desrialization();
    }
}