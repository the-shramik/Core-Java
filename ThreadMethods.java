class MyThread1 extends Thread{
   public void run(){        
        for(int i=0;i<5;i++){
           try{
              System.out.println("thread...1");
              Thread.sleep(2000);
           } 
           catch(InterruptedException ie){
            ie.printStackTrace();
           }
        }
   }
}

class MyThread2 extends Thread{
     public void run(){
        for(int i=0;i<5;i++){
            try{
               System.out.println("thread...2");
               Thread.sleep(2000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
     }
}

public class ThreadMethods{
    public static void main(String[] args){
      
      MyThread1 t1=new MyThread1();
      MyThread2 t2=new MyThread2();

      t1.start();

      try{
         t1.join();
      }
      catch(InterruptedException ie){
        ie.printStackTrace();
      }
      t2.start();

      for(int i=0;i<5;i++){
        try{
          System.out.println("main...thread");
          Thread.sleep(2000);
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
      }
    }
}