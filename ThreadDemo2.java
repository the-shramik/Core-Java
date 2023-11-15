class MyThread1 extends Thread{
    public void run() {
        for(int i=0;i<10;i++){
            try{
            System.out.println("thread..1");
            Thread.sleep(200);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 extends Thread{
     public void run(){
        for(int i=0;i<10;i++){
            try{
            System.out.println("thread...2");
            Thread.sleep(200);
            }
             catch(Exception e){
                e.printStackTrace();
            }
        }
     }
}

class MyThread3 extends Thread{

    public void run(){
        for(int i=0;i<10;i++){
            try{
            System.out.println("thread...3");
            Thread.sleep(200);
            }
             catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo2{
    public static void main(String[] args) throws Exception{
      
      new MyThread1().start();
      new MyThread2().start();
      new MyThread3().start();
    }
}