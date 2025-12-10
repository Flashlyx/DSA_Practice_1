package Threads_Learning;

class MyThreadX implements Runnable{
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
class MyThreadY implements Runnable{
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
public class Sample_Multi_Threading_Implements {
    public static void main(String[] args) {

        Thread mtX = new Thread(new MyThreadX());
        Thread mtY = new Thread(new MyThreadY());

        mtX.start();
        mtY.start();
    }
}
