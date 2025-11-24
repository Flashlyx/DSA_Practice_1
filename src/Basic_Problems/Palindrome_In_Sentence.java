package Basic_Problems;


public class Palindrome_In_Sentence {
    public static boolean isPalindrome(String s) {

        if(s == null || s.length() <=1){
            return false;
        }
        int left = 0, right = s.length() - 1;

        while (left < right){
            char rightChar = s.charAt(right);
            char leftChar = s.charAt(left);

            if (Character.toLowerCase(rightChar) != Character.toLowerCase(leftChar)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String palindromeInSentence(String str){

        String[] sarr = str.split(" ");
        StringBuilder s1 = new StringBuilder();

        for (int i = 0; i < sarr.length; i++){
            if (sarr[i].length() > 1){
                if (isPalindrome(sarr[i])){
                    s1.append(sarr[i]).append(" ");
                }
            }
        }
        return s1.toString();
    }

    public static void main(String[] args) {

        System.out.println(palindromeInSentence("Mom said that civic duties matter, even in a level situation"));
    }
}
