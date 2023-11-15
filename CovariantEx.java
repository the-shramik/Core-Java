class Parent {

    public Parent meth() {

        return new Parent();
    }
}

class Child extends Parent {

    @Override
    public Child meth() {
        return new Child();
    }
}

public class CovariantEx {
    public static void main(String[] args) {

    }
}
