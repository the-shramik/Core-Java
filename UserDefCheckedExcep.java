import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class UserDefCheckedExcep {

    public void check(int age) throws InvalidAgeException {
        if (age > 22) {
            System.out.println("eligible for marriage!");
        } else {
            throw new InvalidAgeException("not eligible!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDefCheckedExcep udc = new UserDefCheckedExcep();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        try {
            udc.check(age);
        } catch (InvalidAgeException ie) {
            ie.printStackTrace();
        }

        sc.close();

    }
}
