class MyThread extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            try{
                System.out.println("thread..executing....");
                Thread.sleep(2000);
            }
            catch(InterruptedException ie){
                System.out.println("interruption is occured!");
            }
        }
    }
}

public class ThraedInterruptionEx{
    public static void main(String[] args){
          MyThread t=new MyThread();
          t.start();
          t.interrupt();
    }
}