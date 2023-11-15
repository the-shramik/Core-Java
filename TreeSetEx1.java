import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetEx1{
     public static void main(String[] args){
        
        TreeSet<String> t1=new TreeSet<String>(new MyComp());

        t1.add("shubham");
        t1.add("raju");
        t1.add("bob");
        t1.add("zax");

        System.out.println(t1);
    }
}

class MyComp implements Comparator<String>{
    
    public int compare(String s1,String s2){
        return s2.compareTo(s1);
    }
}