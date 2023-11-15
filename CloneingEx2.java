public class CloneingEx2 implements Cloneable {

    int a = 10;
    int b = 20;

    public static void main(String[] args) throws Exception {
        CloneingEx2 cl1 = new CloneingEx2();

        System.out.println(cl1.a);
        System.out.println(cl1.b);

        CloneingEx2 cl2 = (CloneingEx2) cl1.clone();

        cl1.a = 100;
        cl1.b = 200;

        System.out.println(cl1.a);
        System.out.println(cl1.b);

        System.out.println(cl2.a);
        System.out.println(cl2.b);

    }
}