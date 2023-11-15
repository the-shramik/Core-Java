public class StrictFpModEx {

    double f1 = 128808987.58;
    double f2 = 890659.92;

    public void m1() {
        System.out.println(f1 + f2);
    }

    public strictfp void m2() {
        System.out.println(f1 + f2);
    }

    public static void main(String[] args) {
        StrictFpModEx sf = new StrictFpModEx();

        sf.m1();
        sf.m2();
    }
}
