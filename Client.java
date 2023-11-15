abstract class Test{
    abstract public void disp();
}

public class Client{
    public static void main(String[] args){
         
         Test t=new Test(){
            
            public void disp(){
                System.out.println("Hello");
            }
         };

         t.disp();
        
         new Test(){
            
            public void disp(){
                System.out.println("hello");
            }
         }.disp();
        
    }
}