public class SynchronizedEx {

    public static synchronized void status(String str) {
        for (int i = 1; i < 5; i++) {
            System.out.println(str);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();
        new MyThread3().start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        SynchronizedEx.status("thraed1");
    }
}

class MyThread2 extends Thread {
    public void run() {
        SynchronizedEx.status("thread2");
    }
}

class MyThread3 extends Thread {
    public void run() {
        SynchronizedEx.status("thread3");
    }
}