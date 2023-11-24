import java.util.Scanner;

class User1 {
    String name;
    long accNo;
    double accBal;

    public User1() {
    }

    public User1(String name, long accNo, double accBal) {
        this.name = name;
        this.accNo = accNo;
        this.accBal = accBal;
    }

}

class InvalidBalanceException extends RuntimeException {
    public InvalidBalanceException(String str) {
        super(str);
    }
}

public class UserDefUnCheckedExcep {

    public void pay(double cash, User1 u) {

        double bal = u.accBal;
        System.out.println(bal);
        if (cash > bal) {
            throw new InvalidBalanceException("insufficiant balance!");
        } else {
            System.out.println("paid successfully!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User1 u = new User1("guru", 55984985049L, 76594);
        UserDefUnCheckedExcep udc = new UserDefUnCheckedExcep();

        System.out.println("Kindly,enter cash how much you have to pay:");
        double cash = sc.nextDouble();

        udc.pay(cash, u);

        sc.close();
    }
}
