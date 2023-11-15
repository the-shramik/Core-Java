import java.util.TreeMap;
import java.util.SortedMap;

public class TreeMapEx1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(77, "ggg");
        tm.put(22, "fff");
        tm.put(11, "aaa");
        tm.put(66, "eee");
        tm.put(33, "xxx");
        tm.put(44, "zzz");
        tm.put(55, "lll");

        System.out.println(tm);

        SortedMap<Integer, String> sm = tm.subMap(33, 77);
        TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>(sm);

        System.out.println(tm2);

        SortedMap<Integer,String> sm2=tm.headMap(44);
        TreeMap<Integer,String> tm3=new TreeMap<Integer,String>(sm2);
        System.out.println(tm3);

    }
}
