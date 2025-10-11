package PrimeNumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static boolean isPrimeNum(int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> primeNumbersInRange(int start, int end){

        List<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++){
            if (isPrimeNum(i)){
                primes.add(i);
            }
        }
        if (primes.isEmpty()){
            throw new IllegalArgumentException("no prime numbers found");
        }

        return primes;
    }

    public static void main(String[] args){
        List<Integer> a = primeNumbersInRange(15,40);
        System.out.println(a);

        int sum = a.get(0) + a.get(a.size() -1);
        System.out.println(sum);


    }
}
