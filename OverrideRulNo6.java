class Parent {

    private void meth() {
        System.out.println("parent meth()!");
    }
}

public class OverrideRulNo6 extends Parent {

    // @Override
    private void meth() {
        System.out.println("child meth()");
    }

    public static void main(String[] args) {
        new OverrideRulNo6().meth();
    }
}
