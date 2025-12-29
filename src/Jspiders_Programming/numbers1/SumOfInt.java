package Jspiders_Programming.numbers1;

public class SumOfInt {
    public static int sumOfInt(int num){
        int sum = 0;

        while(num != 0){
            int digit = num % 10;

            sum += digit;

            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfInt(12345));
    }
}
