class Animal {

}

class Dog extends Animal {

}

class Test {

    public Animal meth() {
        return new Animal();
    }
}

public class MethodOverrideEx extends Test {

    @Override
    public Dog meth() {
        return new Dog();
    }

    public static void main(String[] args) {

    }
}
