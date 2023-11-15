public class ImmutableEx {

    public static int modify(Integer i) {
        i = i + 1;

        return i;
    }

    public static void main(String[] args) {
        Integer i = new Integer(10);

        System.out.println(ImmutableEx.modify(i));
    }
}