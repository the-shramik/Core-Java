class Outer{
    private int x=20;
    private int y=10;

    class Inner{
      int a=200;
      int b=100;

      public void meth(int m,int n){
         System.out.println(m+n);
         System.out.println(a+b);
         System.out.println(x+y);
      }
    }
}

public class InnerClassEx2{
    public static void main(String[] args){
      new Outer().new Inner().meth(2000,1000);
    }
}