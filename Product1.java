public class Product1 implements Comparable<Product1>{
     int id;
     String name;
     double cost;

     public Product1(int id,String name,double cost){
        this.id=id;
        this.name=name;
        this.cost=cost;
    }

    public int compareTo(Product1 p){
        if(this.id==p.id){
            return 0;
        }
        else if(this.id>p.id){
            return 1;
        }
        else{
            return -1;
        }
    }
}