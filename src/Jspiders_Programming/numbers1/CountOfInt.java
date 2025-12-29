package Jspiders_Programming.numbers1;

public class CountOfInt {
    public static int countOfInt(int num){
        int count = 0;

        while(num != 0){
            count += 1;

            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOfInt(1234567));
    }
}
