class Test {

}

public class AllConversionsEx{
    public static void main(String[] args){

        //primitive----->wrapper
        Integer i1=new Integer(10);

        //String------>wrapper
        Integer i2=Integer.valueOf("20");

        System.out.println(i1+i2);

        //wrapper----->primitive
        Integer i3=new Integer(200);
        Integer i4=new Integer(300);

        int a=i3.intValue();
        float b=i4.floatValue();

        System.out.println(a+b);

        //wrapper------->String
        String s1=i3.toString();
        String s2=i4.toString();

        System.out.println(s1+s2);


        //primitive------>String
        int x=20;
        int y=20;

        String s3=String.valueOf(x);
        String s4=String.valueOf(y);

        System.out.println(s3+s4);

        //String--------->primitive
        String s5="70";
        String s6="80";

        int e=Integer.parseInt(s5);
        float f=Float.parseFloat(s6);

        System.out.println(e+f);

        Test t=new Test();
        System.out.println(t);
    }
}