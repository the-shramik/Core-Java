import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a name:");
            String name = sc.nextLine();
            System.out.println("Name: " + name);
        }

    }
}
