class DaemonThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                System.out.println("daemon thread!");
                Thread.sleep(1000);

            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

class NormalThraed extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
              System.out.println("normal thread.....");
              Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

public class DaemonThreadEx{
    public static void main(String[] args){
     
     DaemonThread t1=new DaemonThread();
     t1.setDaemon(true);
     t1.start();

     NormalThraed t2=new NormalThraed();
     t2.start();
    }
}