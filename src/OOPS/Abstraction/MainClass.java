package OOPS.Abstraction;

class Welcome implements Service{
    @Override
    public void greetUser(String userName) {
        System.out.println("Welcome ! " + userName);
    }
}
public class MainClass {
    public static void main(String[] args) {
        Service s1 = new Welcome();
        s1.greetUser("Logan");
    }
}
