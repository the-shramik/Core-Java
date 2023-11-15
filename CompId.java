import java.util.Comparator;

public class CompId implements Comparator{
    
    public int compare(Object o1,Object o2){
        Employee emp1=(Employee) o1;
        Employee emp2=(Employee) o2;

        if(emp1.id==emp2.id){
            return 0;
        }
        else if(emp1.id>emp2.id){
            return 1;
        }
        else{
            return -1;
        }
    }
}