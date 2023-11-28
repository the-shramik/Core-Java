/**
 * StringOperation is a functional interface.
 */
@FunctionalInterface
interface StringOperation {
    int lengthString(String str);
}

public class LambdaEx2 {
    public static void main(String[] args) {

        StringOperation so = (String str) -> str.length();

        System.out.println(so.lengthString("shramik"));
    }
}
