import java.io.Serializable;

public class Emp implements Serializable {
    int id;
    String name;

    public Emp(int id,String name){
        this.id=id;
        this.name=name;
    }
    
}