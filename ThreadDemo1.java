class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
            System.out.println("user thread");
            Thread.sleep(2000);
            }
            catch(Exception ie){
                ie.printStackTrace();
            }
        }
    }
}

public class ThreadDemo1{
    public static void main(String[] args){

           MyThread t=new MyThread();
        //    t.start(); 
             t.run();

           for(int i=0;i<10;i++){
            try{
            System.out.println("main thread");
            Thread.sleep(2000);
            }
            catch(Exception ie){
                ie.printStackTrace();
            }
           }
    }
}