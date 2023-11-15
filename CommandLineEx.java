public class CommandLineEx {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[3]);

        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println("The sum of this two numbers: " + (a + b));
    }
}
