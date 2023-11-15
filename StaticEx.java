class A {
    static {
        System.out.println("A class static block!");
    }
}

class B {
    public static void meth() {
        System.out.println("Static meth of B class!");
    }
}

public class StaticEx {
    public static void main(String[] args) {
        try {
            Class.forName("A");
            Class.forName("B");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
