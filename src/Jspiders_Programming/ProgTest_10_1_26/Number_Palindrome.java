package Jspiders_Programming.ProgTest_10_1_26;

public class Number_Palindrome {
    public static boolean numberPalindrome(int num){
        int temp = num;
        int revNum = 0;
        while(num != 0){
            int digit = num % 10;

            revNum = (revNum * 10) + digit;

            num = num / 10;
        }
        return (temp == revNum);
    }

    public static void main(String[] args) {
        System.out.println(
                numberPalindrome(1234321)
        );

        System.out.println(
                numberPalindrome(123456)
        );


    }
}
