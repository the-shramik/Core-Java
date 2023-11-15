import java.util.Scanner;

class InvalidAgeException extends Exception {

}

public class ExceptionEx {

     public void check(int age) throws InvalidAgeException {

          if (age >= 18) {
               System.out.println("You are valid!");
          } else {
               throw new InvalidAgeException();
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter a age:");
          int age = sc.nextInt();

          ExceptionEx ee = new ExceptionEx();
          try {
               ee.check(age);
          } catch (Exception e) {
               e.printStackTrace();
          } finally {
               sc.close();
          }

     }
}
