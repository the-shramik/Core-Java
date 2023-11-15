interface Birds {
    void fly();

    void swim();
}

class Parot implements Birds {

    public void fly() {
        System.out.println("Parot can fly!");
    }

    public void swim() {
        System.out.println("parot can't swim!");
    }
}

class Penguin implements Birds {
    public void fly() {
        System.out.println("Penguin can't fly!");
    }

    public void swim() {
        System.out.println("Penguin can swim!");
    }
}

public class TestBirdsClient {

    // instead of this
    // public void parotInfo(Parot p) {
    // p.fly();
    // p.swim();
    // }

    // public void penguinInfo(Penguin p) {
    // p.fly();
    // p.swim();
    // }

    // this is recomanded
    public void info(Birds b) {
        b.fly();
        b.swim();
    }

    public static void main(String[] args) {
        TestBirdsClient t = new TestBirdsClient();

        t.info(new Parot());
        t.info(new Penguin());
    }
}
