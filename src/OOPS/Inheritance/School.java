package OOPS.Inheritance;

class SchoolDetails {

    public void welcomeMessage(){
        System.out.println("Welcome to xyz School !");
    }
}

class StudentDetails extends SchoolDetails{

    public void students(String sname){
        System.out.println("Student Name : " + sname);
    }
}

public class School{
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();

        s1.welcomeMessage();
        s1.students("flash");
    }
}


