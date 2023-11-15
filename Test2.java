abstract class Test {
    abstract void m1();

    abstract void m2();

    abstract void m3();

    public void m4() {
        System.out.println("m4()");
    }
}

abstract class Test1 extends Test {
    public void m1() {
        System.out.println("m1()");
    }
}

public class Test2 extends Test1 {
    public void m2() {
        System.out.println("m2()");
    }

    public void m3() {
        System.out.println("m3()");
    }

    public static void main(String[] args) {
        Test t = new Test2();

        t.m1();
        t.m2();
        t.m3();
        t.m4();
    }
}
