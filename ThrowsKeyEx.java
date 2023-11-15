public class ThrowsKeyEx {

    public void m1() throws InterruptedException {
        System.out.println("1..........");
        Thread.sleep(3000);
        System.out.println("2..........");
    }

    public void m2() throws InterruptedException {
        m1();
    }

    public void m3() throws InterruptedException {
        m2();
    }

    public static void main(String[] args) throws InterruptedException {
        ThrowsKeyEx te = new ThrowsKeyEx();
        te.m3();
    }
}
