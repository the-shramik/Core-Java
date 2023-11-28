/**
 * MyFunctionalInterface is a functional interface which contains only one
 * functional/abstract.
 * The functional interface may contain deafult method or static method or may
 * not contain but functional/abstarct method must be single.
 * 
 */
@FunctionalInterface
interface MyFunctionalInterface {
    void meth();
}

public class LambdaEx1 {
    public static void main(String[] args) {

        // for single statement
        MyFunctionalInterface mi = () -> System.out.println("lambda expresin!");
        mi.meth();
        // System.out.println(mi.getClass().getName());

        // for multiple statement
        MyFunctionalInterface mii = () -> {
            System.out.println("lambada expression-1 statement");
            System.out.println("lamabda expression -2 statement");
        };

        mii.meth();
        // System.out.println(mii.getClass().getName());
        // System.out.println(mi.getClass().getName());
    }
}
