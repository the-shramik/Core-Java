import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class SortingEx{
    public static void main(String[] args){
       
       ArrayList<String> al=new ArrayList<String>();

       al.add("sonu");
       al.add("balu");
       al.add("nanu");
       al.add("ramu");
       
       System.out.println("Before Sorting:");
       System.out.println(al);

       Collections.sort(al);

       System.out.println("After sorting:");
       System.out.println(al);


    }
}