import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;

public class CollSeriEx{
    public static void main(String[] args){

        ArrayList<Emp> al=new ArrayList<Emp>();
        al.add(new Emp(111,"sonu"));
        al.add(new Emp(222,"alok"));
        al.add(new Emp(333,"nina"));
        al.add(new Emp(444,"rahul"));
        al.add(new Emp(555,"vina"));

        //serialization
        try{
            FileOutputStream fos=new FileOutputStream("collection.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(al);
            System.out.println("seralization is completed!");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        //desrialization
        try{
            FileInputStream fis=new FileInputStream("collection.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList<Emp> newAl=(ArrayList<Emp>)ois.readObject();

            Iterator<Emp>  itr=newAl.iterator();

            while(itr.hasNext()){
                Emp e=itr.next();
                System.out.println(e.id+" "+e.name);
            } 

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}