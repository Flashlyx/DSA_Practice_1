package Jspiders_Programming.numbers1;

public class ReverseInt {
    public static int reverseInt(int num){

        int revNum = 0;

        while(num != 0){
            int digit = num % 10;

            revNum = (revNum * 10) + digit;

            num = num / 10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        System.out.println(reverseInt(12340739));
    }
}
