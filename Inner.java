   class Outer{
    
    static int a=100;
    static int b=200;

    public static void m1(){
        System.out.println("outer class m1()!");
    }

    static class Inner{
        int x=1000;
        int y=2000;

        public void m2(){
             System.out.println(x);
             System.out.println(y);
             System.out.println(a);
             System.out.println(b);
             m1();
        }
        public static void main(String[] args){
            
            new Outer.Inner().m2();
        }
    }
}