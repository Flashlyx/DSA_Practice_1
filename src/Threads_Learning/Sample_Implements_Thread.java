package Threads_Learning;

class MyThread2 implements Runnable{
    public void run(){
        System.out.println(" My Thread 2 is running !!! ");
    }
}
public class Sample_Implements_Thread {
    public static void main(String[] args) {
        Thread mt2 = new Thread(new MyThread2());
        mt2.start();
    }
}
