interface It {
    void m1();

    void m2();

    void m3();

    void m4();

    void m5();

}

class Adapter implements It {
    public void m1() {
    }

    public void m2() {
    }

    public void m3() {
    }

    public void m4() {
    }

    public void m5() {
    }
}

public class Adapterclass extends Adapter {

    public void m3() {
        System.out.println("m3() method!");
    }

    public void m4() {
        System.out.println("m4() method!");
    }

    public static void main(String[] args) {
        new Adapterclass().m3();
        new Adapterclass().m4();

    }
}
