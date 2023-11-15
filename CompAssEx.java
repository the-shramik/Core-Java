import java.util.LinkedList;
import java.util.Collections;
import java.util.ListIterator;

public class CompAssEx{
    public static void main(String[] args){
        LinkedList<Product2> ll=new LinkedList<Product2>();

        ll.add(new Product2(33,"mobile",25000));
        ll.add(new Product2(44,"mouse",700));
        ll.add(new Product2(22,"laptop",45000));
        ll.add(new Product2(11,"table",1500));
        ll.add(new Product2(55,"headphone",2000));

        // Collections.sort(ll);
        
        Collections.sort(ll,new CompIdDes());

        ListIterator<Product2> lstr=ll.listIterator();

        while(lstr.hasNext()){
            Product2 p=lstr.next();

            System.out.println(p.id+" "+p.name+" "+p.cost);
        }

    }
}