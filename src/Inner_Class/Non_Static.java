package Inner_Class;

class Demo{

    class Sample{

        public void display(){
            System.out.println("Hey I am inner class's Method !");
        }
    }
}

public class Non_Static {
    public static void main(String[] args) {
        Demo d1 = new Demo();

        Demo.Sample s1 = d1.new Sample();

        s1.display();
    }
}
