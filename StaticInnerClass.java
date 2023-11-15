public class StaticInnerClass {
    static int a = 10;
    static int b = 20;

    static class Inner {
        public void disp() {
            System.out.println(a);
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        // StaticInnerClass.Inner i = new StaticInnerClass.Inner();
        // i.disp();

        new StaticInnerClass.Inner().disp();
    }
}