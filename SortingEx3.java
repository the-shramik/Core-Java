import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    
    int id;
    String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;

    }

    public int compareTo(Employee e){
        return name.compareTo(e.name);
    }
}

public class SortingEx3{
    public static void main(String[] args){
        
        ArrayList<Employee> al=new ArrayList<Employee>();

        al.add(new Employee(11,"ccc"));
        al.add(new Employee(22,"ded"));
        al.add(new Employee(33,"ooo"));
        al.add(new Employee(44,"aaa"));
        al.add(new Employee(55,"kkk"));

        Collections.sort(al);

        for(Employee emp: al){
            System.out.println(emp.id+" "+emp.name);
        }
    }
}