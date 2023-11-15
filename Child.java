class Parent {
    public static void m1() {
        System.out.println("Parent class m1()");
    }
}

public class Child extends Parent {

    public static void m1() {
        System.out.println("Child class m1()");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
    }
}
