public class MethodLooping{
    public static boolean m1(){
        return true;
    }

    public static int m2(){
        return 100;
    }
    public static void main(String[] args){
      for(int i=MethodLooping.m2();MethodLooping.m1();i++){
         System.out.println(i);
      }
    }
}