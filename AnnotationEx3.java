class Guru{

    @Deprecated
    public void myMethod(){
        System.out.println("deprecation example!");
    }
}

public class AnnotationEx3{
    public static void main(String[] args){
      
      Guru g=new Guru();
      g.myMethod();
    }
}