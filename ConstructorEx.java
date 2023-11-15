public class ConstructorEx {

    public ConstructorEx() {
        this(10);
        System.out.println("0-args cons!");
    }

    public ConstructorEx(int a) {
        System.out.println("1-args cons!");
    }

    // {
    // System.out.println("instance block executed!");
    // }

    {
        System.out.println("instance block executed!");
    }

    public static void main(String[] args) {
        ConstructorEx ce = new ConstructorEx();
    }
}
