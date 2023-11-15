class Outer{
    int a=10;
    int b=20;
    private String str="guru";
    public void m1(){
        System.out.println("Outer class m1()!");
    }
    class Inner{
      int x=100;
      int y=200;
      
      public void m2(){
        System.out.println("Inner class m2()!");
        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(str);
        m1();
      }

    }
}

public class InnerClassEx{
    public static void main(String[] args){
       
       Outer o=new Outer();
       o.m1();

       Outer.Inner i=o.new Inner();
       i.m2();
    }
}