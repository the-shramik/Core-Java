import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PiprSymbolEx {
    public static void main(String[] args) {

        // unchecked
        Scanner sc = new Scanner(System.in);
        int[] arr = { 12, 14, 16, 18, 20 };
        System.out.println("Enter a index:");
        int ind = sc.nextInt();

        System.out.println("Enter a num:");
        int num = sc.nextInt();
        try {
            System.out.println(arr[ind] / num);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ae) {
            System.out.println("Etion raised: " + ae);
        } finally {
            sc.close();
        }

        // checked
        try {

            Thread.sleep(2000);
            FileInputStream fi = new FileInputStream("abc.txt");
        } catch (InterruptedException | FileNotFoundException e) {
            System.out.println("Exception: " + e);
        }

    }
}
