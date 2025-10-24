package ReverseNumber;

public class ReverseNum {
    public static int reverseNum(int num) {
        int reversedNum = 0;

        while ( num != 0){
            int digit = num % 10;

            reversedNum = (reversedNum * 10) + digit;

            num = num / 10;
        }
        return reversedNum;
    }
    public static int reverseNumLong(int num) {
        // LeetCode Reverse Integer Problem !
        long reversedNum = 0;

        while ( num != 0){
            int digit = num % 10;

            reversedNum = (reversedNum * 10) + digit;

            num = num / 10;
        }
        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE){
            return 0;
        }
        return (int) reversedNum;
    }

    public static void main(String[] args){
        int num1 = 123423562;
        int num2 = 987654321;
        int num3 = 239830726;

        System.out.println(reverseNum(num1));
        System.out.println(reverseNum(num2));
        System.out.println(reverseNumLong(num3));
    }
}
