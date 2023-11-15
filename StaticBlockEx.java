class First {
    static int a = 10;
    static {
        System.out.println("first class static block!");
    }
}

class Second {
    static {
        System.out.println("second class static block!");
    }
}

public class StaticBlockEx {

    static {

        System.out.println("third class static block!");
    }

    public static void main(String[] args) {

        try {

            Class.forName("First");
            Class.forName("Second");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
