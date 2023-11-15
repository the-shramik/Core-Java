import java.util.ArrayList;
import java.util.List;

public class AnnotationEx5 {

    @SafeVarargs
    final private void display(List<String>... products) {
        for (List<String> product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {

        AnnotationEx5 a = new AnnotationEx5();

        List<String> l = new ArrayList<String>();
        l.add("guru");
        l.add("albu");
        l.add("siya");

        a.display(l);

        if (true)
            // int a=10;
            System.out.println("Hi");

        else
            System.out.println(10);
    }
}