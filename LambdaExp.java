interface It{
    void msg();
}

interface It2{
    void meth();
}
public class LambdaExp implements It2{
    @Override
    public void meth(){
        System.out.println("checking!");
    }
    public static void main(String[] args){
         
         It i=()->{System.out.println("good mrng!");};
         i.msg();

         new LambdaExp().meth();
    }
}