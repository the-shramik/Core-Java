public class MethodLocalInnerEx{
  public void meth(){
    class Inner{

        public void disp(){
            System.out.println("method local inner class method!");
        }        
     }
     new Inner().disp();  
  }
    public static void main(String[] args){
       MethodLocalInnerEx ml=new MethodLocalInnerEx();
       ml.meth();
    }
}