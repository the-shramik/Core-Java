public class AllElements {

    int a = 10;
    int b = 20;
    static String str;

    public AllElements() {
        System.out.println("default cons!");
    }

    public AllElements(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println(this.a + this.b);
    }

    public static void mul() {
        System.out.println(new AllElements().a * new AllElements().b);
    }

    {
        System.out.println("instance block!");
    }

    static {
        AllElements.str = "shramik";
        System.out.println(str);
    }

    public static void main(String[] args) {
        AllElements al = new AllElements(5, 6);
        al.add();
        // AllElements.mul();
    }
}