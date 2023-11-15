import java.util.LinkedHashSet;
import java.util.Iterator;

class Employee{
   int id;
   String name;
   
   public Employee(int id,String name){
       this.id=id;
       this.name=name;
   }
}
public class LinkedHashSetEx{
    public static void main(String[] args){
       LinkedHashSet<Employee> hs=new LinkedHashSet<Employee>();

       hs.add(new Employee(11,"Shramik"));
       hs.add(new Employee(22,"John"));
       hs.add(new Employee(33,"Shubham"));

       Iterator<Employee> itr=hs.iterator();

       while(itr.hasNext()){
          Employee e=itr.next();
          System.out.println(e.id+" "+e.name);
       }

    }
}