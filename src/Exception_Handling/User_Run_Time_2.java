package Exception_Handling;

import Exception_Handling.User_Exceptions.InvalidAgeException;

public class User_Run_Time_2 {

    public static void voterAge(int age) throws InvalidAgeException{

        if (age >= 18){
            System.out.println("Voter added !");
        }
        else {
            throw new InvalidAgeException("Invalid Age for Voter");
        }
    }

    public static void main(String[] args) {
        System.out.println("----Main Starts----");

        try{
            voterAge(10);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("---Finally Executed---");
        }

        System.out.println("----Main Ends----");
    }
}

