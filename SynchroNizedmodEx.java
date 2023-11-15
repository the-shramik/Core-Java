class Test{
    synchronized public static void meth(String str){
        for(int i=0;i<5;i++){
         try{
          System.out.println("executing..."+str);
          Thread.sleep(2000);
         }
         catch(InterruptedException ie){
            ie.printStackTrace();
         }
        }
    }
}

class MyThread1 extends Thread{
    public void run(){
        Test.meth("first thread");
    }
}

class MyThread2 extends Thread{
    public void run(){
        Test.meth("second thread");
    }
}

class MyThread3 extends Thread{
    public void run(){
        Test.meth("third thread");
    }
}
public class SynchroNizedmodEx{
    public static void main(String[] args){
       
       new MyThread1().start();
       new MyThread2().start();
       new MyThread3().start();
    }
}
