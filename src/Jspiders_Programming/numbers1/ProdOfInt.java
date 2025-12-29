package Jspiders_Programming.numbers1;

public class ProdOfInt {
    public static int prodOfInt(int num){
        int prod = 1;

        while(num != 0){
            int digit = num % 10;

            prod *= digit;

            num = num / 10;
        }
        return prod;
    }
    public static void main(String[] args) {
        System.out.println(prodOfInt(12345));
    }
}
