
/**
 * @MathemeticalOptrs is a functional interface;
 */

@FunctionalInterface
interface MathemeticalOptrs {
    int operation(int num1, int num2);
}

public class LambdaEx3 {
    public static void main(String[] args) {

        MathemeticalOptrs mopt = (num1, num2) -> num1 + num2;

        System.out.println(mopt.operation(34, 21));
    }
}
