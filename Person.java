import java.io.Serializable;

public class Person implements Serializable {
    transient int age;
    transient String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
