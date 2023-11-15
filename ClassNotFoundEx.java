
public class ClassNotFoundEx{
    public static void main(String[] args){
     try{ 
      Class.forName("aaa");
     }
     catch(ClassNotFoundException ce){
        ce.printStackTrace();
     }
    }
}