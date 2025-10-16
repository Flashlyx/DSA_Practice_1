package Strong_Number;

public class StrongNumber {
    public static int factorial(int remainder){
        int total = 1;
        for (int i = remainder; i >= 1; i--){
            total = total * i;
        }
        return total;
    }

    public static boolean isStrongNumber(int num){
        int temp = num;
        int sum = 0;

        while (num != 0){
            int remainder = num % 10;
            sum = sum + (factorial(remainder));

            num = num / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args){
        int num1 = 145;
        int num2 = 40585;
        int num3 = 100;

        System.out.println(isStrongNumber(num1));
        System.out.println(isStrongNumber(num2));
        System.out.println(isStrongNumber(num3));

        System.out.println(factorial(5));
    }
}
