public class WrapperEx1{
    public static void main(String[] args){

        Integer i1=new Integer(1000);
        Integer i2=new Integer("2000");
        System.out.println(i1+i2);

        Integer i3=Integer.valueOf(3000);
        Integer i4=Integer.valueOf("7000");
        System.out.println(i3+i4);
    }
}