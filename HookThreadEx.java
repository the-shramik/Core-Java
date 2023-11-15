class HookThread extends Thread{
    public void run(){
        System.out.println("HOOK THREAD IS EXECUTED!");
    }
}

class NormalThraed extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
            System.out.println("normal thread!");
            Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
public class HookThreadEx{
    public static void main(String[] args){ 

        NormalThraed t2=new NormalThraed();
        t2.start();

        
        HookThread t1=new HookThread();
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(t1);


    }
}