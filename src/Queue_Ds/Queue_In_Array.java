package Queue_Ds;

import java.util.Arrays;

class QueueLogic{
    int[] queue;
    int boq , toq ; // boq - Beginning , Top - of the Queue

    // We use constructor to initialize values to global variables

    QueueLogic(int size){
        queue = new int[size];
        boq = toq = -1;
    }

    // isEmpty - to check whether the queue is empty
    public boolean isEmpty(){
        return toq == -1 || boq == queue.length;
    }

    // isFull - to check whether the queue is full
    public boolean isFull(){
        return toq == queue.length - 1;
    }

    // enQueue - insert a value into the queue
    public void enQueue(int value){
        if (isFull()){
            System.out.println("Queue is Full !");
        }
        else if (boq == -1){
            boq = 0;
            queue[++toq] = value;
            System.out.println("Value : " + value + " is inserted !");
        }
        else {
            queue[++toq] = value;
            System.out.println("Value : " + value + " is inserted !");
        }
    }

    // deQueue - delete a value from the queue
    public  void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty !");
        }
        else {
            int value = queue[boq];
            boq++;

            if (boq > toq){
                boq = toq = -1;
            }
            System.out.println("Value : " + value + " is removed !");
        }
    }

    // peek - to peek the first element
    public void peek(){
        if (isEmpty()){
            System.out.println("Queue is Empty !");
        }
        else {
            System.out.println("Peek value is : " + queue[boq]);
        }
    }

    // display - print queue elements
    public void display(){
        for (int boq = 0; boq >= toq; boq++){
            System.out.print("[ " + queue[boq] + " ]");
        }
    }
}
public class Queue_In_Array {
    public static void main(String[] args) {
        QueueLogic queue = new QueueLogic(5);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(50);

        System.out.println();

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        System.out.println();

        queue.display();

    }
}
