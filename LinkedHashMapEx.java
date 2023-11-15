import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapEx {
    public static void main(String[] args){

        LinkedHashMap<Employee,Student> lhm=new LinkedHashMap<Employee,Student>();
        lhm.put(new Employee(111, "guru"),new Student(01,"sonu"));
        lhm.put(new Employee(222, "Alvira"),new Student(02, "monty"));
        lhm.put(new Employee(333,"Shubham"),new Student(03, "Siya"));

        Set<Employee> s=lhm.keySet();

        for(Employee e:s){
            System.out.println(e.id+" "+e.name);
        }

        Collection<Student> c=lhm.values();
        
        for(Student ss:c){
            System.out.println(ss.id+" "+ss.name);
            
        }
        
        Set<Entry<Employee,Student>> ss=lhm.entrySet();

        for(Entry<Employee,Student> e:ss){
              Employee ee=e.getKey();

              System.out.print(ee.id+" "+ee.name);
              System.out.print(" ");
              
              Student s2=e.getValue();
              System.out.print(s2.id+" "+s2.name);
              
        }

    }
    
}
