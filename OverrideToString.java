class Employee{
    int id;
    String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
        return "Emp id: "+this.id+" Emp name: "+this.name;
    }
}
public class OverrideToString{
   public static void main(String[] args){
       
       Employee e=new Employee(111,"shramik");
       System.out.println(e);
       System.out.println(e.toString());
   }
}