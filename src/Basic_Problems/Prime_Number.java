package Basic_Problems;

import java.util.*;

public class Prime_Number {

    public static boolean isPrime( int num ){

        if (num <= 0 || num == 1){
            return false;
        }

        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> primeInRange(int start, int end){

        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = start; i <= end; i++){
            if (isPrime(i)){
                l1.add(i);
            }
        }
        return l1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println();
            System.out.println("Welcome !");
            System.out.println("1.Check whether the number is Prime ?  ");
            System.out.println("2.Print list of Prime numbers in range!");
            System.out.println("3.quit");
            System.out.print("Enter your choice : " );
            int choice = scan.nextInt();


            if (choice == 1){
                System.out.print("Enter a number : ");
                int num = scan.nextInt();
                System.out.println(isPrime(num));
            }
            else if(choice == 2){
                System.out.print("Enter range: start end ");
                int start = scan.nextInt();
                int end = scan.nextInt();
                System.out.print(primeInRange(start, end));
            }
            else if(choice == 3){
                System.out.println("Thank You !");
                break;
            }
        }
        scan.close();
    }
}
