import java.io.PrintStream;

public class IoPackageEx9 {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("D:\\guru.txt")) {
            String name = "shramik";
            int age = 22;
            boolean isEducated = true;

            ps.println(name);
            ps.println(age);
            ps.println(isEducated);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
