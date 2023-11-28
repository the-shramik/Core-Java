import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEx4 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("shagun");
        list.add("myra");
        list.add("sunil");
        list.add("kamil");

        System.out.println(list);
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        System.out.println(list);

    }
}
