class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class ThreadDemo3{
    public static void main(String[] args){
         
         MyThread t1=new MyThread();
         t1.setPriority(Thread.MAX_PRIORITY);

         MyThread t2=new MyThread();
         t2.setPriority(Thread.MIN_PRIORITY);

         t1.start();
         t2.start();
    }
} 