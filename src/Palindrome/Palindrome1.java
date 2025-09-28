package Palindrome;

public class Palindrome1 {

    public static boolean isPalindrome1(String S){
        if (S == null){
            return false;
        }
        int left = 0;
        int right = S.length() - 1;
        while (left < right){
            char leftChar = S.charAt(left);
            char rightChar = S.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String s1 = "110A011";
        String s2 = "Noon";
        String s3 = "flAsh";
        String s4 = "@@11B--b4b@B11";

        System.out.println(isPalindrome1(s1));
        System.out.println(isPalindrome1(s2));
        System.out.println(isPalindrome1(s3));
        System.out.println(isPalindrome1(s4));
    }
}
