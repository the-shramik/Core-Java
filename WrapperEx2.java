public class WrapperEx2{
    public static void main(String[] args){
        
        Integer i1=new Integer(100);
        Integer i2=new Integer(300);

        //wrapper------->primitive

        int a=i1.intValue();
        int b=i2.intValue();

        System.out.println(a+b);


        //wrapper--------->String
        String s1=i1.toString();
        String s2=i2.toString();

        System.out.println(s1+s2);
    }
}