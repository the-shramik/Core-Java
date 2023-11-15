import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 20, 30, 40 };
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("");
        System.out.println("Enter a Index: ");
        int ind = sc.nextInt();
        try {

            System.out.println("Selested index value: " + arr[ind]);
            try {
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                System.out.println(arr[ind] / num);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }

        } catch (ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
