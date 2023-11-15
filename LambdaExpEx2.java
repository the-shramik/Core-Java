interface Message{
    void disp();
}

public class LambdaExpEx2{

    static void call(Message m){
        m.disp();
    }
    public static void main(String[] args){
       
       //approach:1---->normal
       LambdaExpEx2.call(new Test());

       //approach:2---->anonymous
       LambdaExpEx2.call(new Message(){
        public void disp(){
          System.out.println("anonymous good morning!");
        }
       });

       //approach:3-->lambda
       LambdaExpEx2.call(()->System.out.println("lambda good morning!"));

    }
}

class Test implements Message{
    public void disp(){
        System.out.println("normal good morning!");
    }
}