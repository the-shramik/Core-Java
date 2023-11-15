public class CloneingEx implements Cloneable {

    int a = 10;
    int b = 20;

    public static void main(String[] args) throws Exception {

        CloneingEx ce = new CloneingEx();
        System.out.println(ce.a);
        System.out.println(ce.b);

        ce.a = 100;
        ce.b = 200;
        CloneingEx ce2 = (CloneingEx) ce.clone();
        System.out.println(ce.a);
        System.out.println(ce.b);

        ce.a = 1000;
        ce.b = 2000;
        System.out.println(ce.a);
        System.out.println(ce.b);

        System.out.println(ce2.a);
        System.out.println(ce2.b);

    }
}
