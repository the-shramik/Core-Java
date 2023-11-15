import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

class Product {
    int id;
    String name;
    double cost;

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}

public class LinkedHashMapAss {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Product> lhm = new LinkedHashMap<Integer, Product>();
        lhm.put(01, new Product(111, "fan", 2000));
        lhm.put(02, new Product(222, "TV", 10000));
        lhm.put(03, new Product(333, "Computer", 20000));

        Set<Entry<Integer, Product>> s = lhm.entrySet();

        Iterator<Entry<Integer, Product>> itr = s.iterator();

        while (itr.hasNext()) {
            Entry<Integer, Product> e = itr.next();

            Product p = e.getValue();
            if (p.id == 111) {
                itr.remove();
                System.out.println("product removed!");
            }
        }

        for (Entry<Integer, Product> e : lhm.entrySet()) {
            Product p = e.getValue();

            System.out.println(e.getKey() + " " + p.id + " " + p.name + " " + p.cost);
        }

    }
}
  