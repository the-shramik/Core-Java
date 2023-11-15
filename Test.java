abstract public class Test {
    abstract void meth();

    public static void main(String[] args) {
        Test t = new Test1();
        t.meth();
    }
}

class Test1 extends Test {
    public void meth() {
        System.out.println("Meth..!");
    }
}