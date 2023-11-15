interface It{
  void meth();
}

public class TestClient2{
    public static void main(String[] args){
       It i=new It(){
         public void meth(){
            System.out.println("meth....!");
        }        
      };
      i.meth();
    }
}