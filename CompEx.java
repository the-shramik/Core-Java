import java.util.ArrayList;
import java.util.Collections;

public class CompEx{
    public static void main(String[] args){

        ArrayList<Employee> al=new ArrayList<Employee>();

      
        al.add(new Employee(33,"shubham"));
        al.add(new Employee(55,"rohan"));
        al.add(new Employee(22,"guru"));
        al.add(new Employee(11,"manoj"));
        al.add(new Employee(44,"anu"));

        Collections.sort(al,new CompId());
        // Collections.sort(al,new CompId());
        
       
        for(Employee e:al){
            System.out.println(e.id+" "+e.name);
        }
    }

}