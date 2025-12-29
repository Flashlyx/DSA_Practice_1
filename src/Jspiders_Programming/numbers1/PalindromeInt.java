package Jspiders_Programming.numbers1;

public class PalindromeInt {
    public static boolean palindromeInt(int num){

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
        System.out.println(palindromeInt(12340739));
        System.out.println(palindromeInt(1234321));
    }
}
