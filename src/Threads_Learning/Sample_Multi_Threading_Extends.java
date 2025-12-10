package Threads_Learning;

class MyThreadA extends  Thread{
    public void run(){
        for (int i = 0; i <= 10; i++){
            try {
                System.out.println("My Thread 'X' is running : " + i );
                Thread.sleep(1000);
            }
            catch (InterruptedException e1){
                System.out.println("Exception Handled !!!");
            }

        }
    }
}
class MyThreadB extends  Thread{
    public void run(){
        for (int i = 0; i <= 10; i++){
            try {
                System.out.println("My Thread 'Y' is running : " + i );
                Thread.sleep(2000);
            }
            catch (InterruptedException e1){
                System.out.println("Exception Handled !!!");
            }

        }
    }
}
public class Sample_Multi_Threading_Extends {
    public static void main(String[] args) {

        MyThreadA mtA = new MyThreadA();
        MyThreadB mtB = new MyThreadB();

        mtA.start();
        mtB.start();
    }
}
