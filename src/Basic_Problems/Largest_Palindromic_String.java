package Basic_Problems;

import static Basic_Problems.Palindrome_In_Sentence.isPalindrome;

public class Largest_Palindromic_String {
    public static String largestPalindromicString(String str){
        String res = "";
        // str = "banana" len =6
        //        012345

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                if (isPalindrome(substr) && substr.length() > res.length()) {
                    res = substr;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(largestPalindromicString("banana"));
    }
}
