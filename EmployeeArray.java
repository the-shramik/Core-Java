class Employee{
    int id;
    String name;
    public Employee(int id,String name){
       this.id=id;
       this.name=name;
    }
}

public class EmployeeArray{
    public static void main(String[] args){
       Employee[] emp=new Employee[3];

    //    Employee e1=new Employee(111,"shramik");
    //    Employee e2=new Employee(222,"albu");
    //    Employee e3=new Employee(333,"guru");

       emp[0]=new Employee(111,"shramik");
       emp[1]=new Employee(222,"guru");
       emp[2]=new Employee(333,"alvira");

       for(Employee e:emp){
          System.out.println(e.id+" "+e.name);
       }

    }
}