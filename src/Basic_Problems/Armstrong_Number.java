package Basic_Problems;

public class Armstrong_Number {

    public static boolean isArmstrongNumber(int num){

        int temp = num;
        int sum = 0;
        int count = String.valueOf(num).length();

        // num = 153
        while (num != 0){
            int lastDigit = num % 10; // 3

            sum = sum + ( (int) (Math.pow(lastDigit, count)) );

            num = num / 10;
        }

        return (temp == sum);
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));

        System.out.println(isArmstrongNumber(102));

        System.out.println(isArmstrongNumber(370));

    }
}
