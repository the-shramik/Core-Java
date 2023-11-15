import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapAss {
    public static void main(String[] args) {
        TreeMap<Product, Customer> tm = new TreeMap<Product, Customer>(new MyComp());

        tm.put(new Product(44, "book", 20.34), new Customer(4, "aaa", 50.47));
        tm.put(new Product(22, "pen", 10.32), new Customer(2, "ccc", 20.3));
        tm.put(new Product(33, "laptop", 45867.56), new Customer(3, "sss", 7000.56));
        tm.put(new Product(11, "bag", 1500.33), new Customer(1, "ggg", 400.35));

        Set<Entry<Product, Customer>> s = tm.entrySet();

        Iterator<Entry<Product, Customer>> itr = s.iterator();

        while (itr.hasNext()) {
            Entry<Product, Customer> e = itr.next();

            Product p = e.getKey();
            Customer c = e.getValue();

            System.out.println(p.id + " " + p.name + " " + p.cost + " " + c.id + " " + c.name + " " + c.ammount);
            ;
        }

    }
}
