package Threads_Learning;

class MyThread1 extends Thread{
    public void run(){
        System.out.println("My Thread 1 running !!!");
    }
}

public class Sample_Extends_Thread {
    public static void main(String[] args) {

        MyThread1 mt1 = new MyThread1();
        mt1.start();
        Thread.getAllStackTraces().keySet().forEach(System.out::println);
    }
}
