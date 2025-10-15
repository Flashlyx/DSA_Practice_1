package Armstrong_Number;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int num) {
        int temp = num; // Store original num value and compare with sum later
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length(); // Get the number of digits

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            sum += (int) Math.pow(digit, numberOfDigits);

            num /= 10; // Remove the last digit
        }

        return sum == temp;
    }

    public static void main(String[] args){

        int num1 = 153;
        int num2 = 370;
        int num3 = 1634;
        int num4 = 123;

        System.out.println(isArmstrongNumber(num1));
        System.out.println(isArmstrongNumber(num2));
        System.out.println(isArmstrongNumber(num3));
        System.out.println(isArmstrongNumber(num4));
    }
}
