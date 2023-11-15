interface It1 {
    interface It2 {
        void meth();
    }
}

class InterfaceContainer {
    interface It3 {
        void display();
    }
}

public class NestedInterfaceEx implements InterfaceContainer.It3, It1.It2 {

    public void meth() {
        System.out.println("Nested inetface method!");
    }

    public void display() {
        System.out.println("interface inside the class method!");
    }

    public static void main(String[] args) {
        NestedInterfaceEx nt = new NestedInterfaceEx();
        nt.meth();
        nt.display();
    }
}
