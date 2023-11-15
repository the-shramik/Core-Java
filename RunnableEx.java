class MyRunnable1 implements Runnable{
    public void run(){
     for(int i=0;i<5;i++){
        try{ 
            System.out.println("first thread....!");
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
     }
   }
}

class MyRunnable2 implements Runnable{
    public void run(){
      for(int i=0;i<5;i++){
        try{
            System.out.println("second thread....!");
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
      }
    }
}

public class RunnableEx{
    public static void main(String[] args){
      
      MyRunnable1 r1=new MyRunnable1();
      Thread t1=new Thread(r1);

      MyRunnable2 r2=new MyRunnable2();
      Thread t2=new Thread(r2);

      t1.start();
      t2.start();
    }
}