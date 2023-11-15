import java.util.Comparator;
import java.util.Comparator;

public class MyComp implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        if (p1.id == p2.id) {
            return 0;
        } else if (p1.id > p2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
