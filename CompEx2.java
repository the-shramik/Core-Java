import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CompEx2{
    public static void main(String[] args){
       ArrayList<Student> al=new ArrayList<Student>();

       al.add(new Student(33,"monty",17));
       al.add(new Student(44,"john",15));
       al.add(new Student(22,"sonu",13));
       al.add(new Student(11,"rahul",18));
       al.add(new Student(55,"sara",10));

       Collections.sort(al,new CompAge());

       Iterator<Student> itr=al.iterator();
       while(itr.hasNext()){
         Student s=itr.next();

         System.out.println(s.id+" "+s.name+" "+s.age);
       }

    }
}