import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable{
     int id;
     String name;

     public Employee(int id,String name){
        this.id=id;
        this.name=name;
     }

     public int compareTo(Object o){
        Employee e=(Employee) o;

        if(id==e.id){
            return 0;
        }
        else if(id>e.id){
            return 1;
        }
        else{
            return -1;
        }
     }
}

public class SortingEx2{
    public static void main(String[] args) throws Exception{
        
        ArrayList<Employee> al=new ArrayList<Employee>();

        al.add(new Employee(44,"manoj"));
        al.add(new Employee(22,"guru"));
        al.add(new Employee(11,"shubham"));
        al.add(new Employee(33,"rahul"));

        Collections.sort(al);

        for(Employee emp:al){
            System.out.println(emp.id+" "+emp.name);
        }
    }
}