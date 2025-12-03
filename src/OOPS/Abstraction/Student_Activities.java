package OOPS.Abstraction;

abstract class Student {

    public void welcomeMessage(){
        System.out.println("Welcome to .....!");
    }
    abstract void greetUser();
}

class Greet extends Student{

    @Override
    void greetUser() {
        System.out.println("Good Morning !");
    }
}

public class Student_Activities {
    public static void main(String[] args) {
        Student s1 = new Greet();

        s1.welcomeMessage();
        s1.greetUser();
    }
}

