public class GarbageEx1{

    public void finalize(){
        System.out.println("object destroyed!");
        System.out.println(10/0);
    }
    public static void main(String[] args){
          GarbageEx1 g1=new GarbageEx1();
          GarbageEx1 g2=new GarbageEx1();

          System.out.println(g1);
          System.out.println(g2);

          g1=null;
          g2=null;

          System.out.println(g1);
          System.out.println(g2);

          System.gc();
 
    }
}