interface It1 {
    void m1();

    void m2();
}

interface It2 extends It1 {
    void m3();

    void m4();
}

public class Tetst implements It2 {

    public void m1() {
        System.out.println("m1() method!");
    }

    public void m2() {
        System.out.println("m2() method!");
    }

    public void m3() {
        System.out.println("m3() method!");
    }

    public void m4() {
        System.out.println("m4() method!");
    }

    public static void main(String[] args) {
        Tetst t = new Tetst();

        t.m1();
        t.m2();
        t.m3();
        t.m4();
    }
}
