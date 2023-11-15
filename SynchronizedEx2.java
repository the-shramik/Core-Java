class Test {
    public synchronized static void execute() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello.." + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        Test.execute();
    }
}

class MyThread2 extends Thread {
    public void run() {
        Test.execute();
    }
}

class MyThread3 extends Thread {
    public void run() {
        Test.execute();
    }
}

public class SynchronizedEx2 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
