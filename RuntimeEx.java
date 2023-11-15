class Test{

}
public class RuntimeEx{
    public static void main(String[] args){
          
      Runtime r=Runtime.getRuntime();

      System.out.println("The total memory: "+r.totalMemory());
      System.out.println("The free memory: "+r.freeMemory());
      
      for(int i=0;i<100000;i++){
         Test t=new Test();

      }
      
      System.out.println("The free memory after creating objects: "+r.freeMemory());

      r.gc();
      System.out.println("The free memory after destroying objects: "+r.freeMemory());

    }
}