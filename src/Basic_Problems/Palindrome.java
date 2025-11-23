package Basic_Problems;
import java.util.*;

public class Palindrome {

    public static String isPalindrome(String s) {

        int left = 0, right = s.length() - 1;

        while (left < right){
            char rightChar = s.charAt(right);
            char leftChar = s.charAt(left);

            if (Character.toLowerCase(rightChar) != Character.toLowerCase(leftChar)){
                return "FALSE ! The given string ->" + s +" is not a Palindrome!";
            }
            left++;
            right--;
        }
        return "TRUE ! The given string ->" + s +" is a Palindrome!";
    }

    public static String isPalindrome2(String s){

        String str = s.toLowerCase();

        char[] sarr = str.toCharArray();

        int left = 0, right = sarr.length - 1;

        while (left < right){

            if (sarr[left] != sarr[right]){
                return "FALSE ! The given string ->" + s +" is not a Palindrome!";
            }
            left++;
            right--;
        }

        return "TRUE ! The given string ->" + s +" is a Palindrome!";
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.print("Enter a String : ");
            String str = scan.nextLine();

            if (str.equals("quit")){

                System.out.println("Thank you !");
                break;
            }

            System.out.println(isPalindrome(str));
        }
        scan.close();



    }
}
