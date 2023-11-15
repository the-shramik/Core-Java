
class Parent {
    public Parent() {
        System.out.println("parent class cons!");
    }
}

public class SuperClassCons extends Parent {

    public SuperClassCons() {
        this(10);
        System.out.println("child class 0-args cons!");
    }

    public SuperClassCons(int a) {
        System.out.println("child class 1-args cons!");
    }

    public static void main(String[] args) {
        new SuperClassCons();
    }
}
