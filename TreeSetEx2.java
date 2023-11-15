import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetEx2{
    public static void main(String[] args){
       
       TreeSet<Product> ts=new TreeSet<Product>(new IdComp());

       ts.add(new Product(33,"bat",9999));
       ts.add(new Product(22,"ball",748));
       ts.add(new Product(11,"table",2308));
       ts.add(new Product(44,"cable",70));

       Iterator<Product> itr=ts.iterator();

       while(itr.hasNext()){
          Product p=itr.next();

          System.out.println(p.id+" "+p.name+" "+p.cost);
       }
       
    }
}