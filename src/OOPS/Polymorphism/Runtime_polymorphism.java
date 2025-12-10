package OOPS.Polymorphism;

class Animal{
    public void makeSound(){
        System.out.println("Animal makes sound !");
    }
}
class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Dog Barks ! Woof Woof !");
    }
}
class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Cat Meows ! Meow !");
    }
}
public class Runtime_polymorphism {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.makeSound();

        Animal a2 = new Cat();
        a2.makeSound();

        Animal a3 = new Animal();
        a3.makeSound();
    }
}
