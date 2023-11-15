
abstract class AbstractClass {

    {
        System.out.println("abstract class instance block!");
    }

    static {
        System.out.println("abstract class static block!");
    }
}

public class ImplmentClass extends AbstractClass {
    public static void main(String[] args) {
        new ImplmentClass();
        new ImplmentClass();

    }
}
