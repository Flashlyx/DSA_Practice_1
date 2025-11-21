package Basic_Problems;

public class Fibonacci_Series {
    public static void fibonacciSeries(int n){

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++){
            System.out.print(first + " ");

            int sum = first + second;
            first = second;
            second = sum;
        }
    }
    static public void main(String[] args){
        fibonacciSeries(20);
    }
}
