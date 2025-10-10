package Sorted_Squares;

import java.util.Arrays;

public class SortedSquaresBF {
    public static int[] sortedSquaresBF(int[] arr){

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
           result[i] = arr[i] * arr[i];
        }
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args){
        int[] arr = {-4, -3 , 0 , 5 , 3 , 10};
        int[] res = sortedSquaresBF(arr);
        System.out.println(Arrays.toString(res));

    }
}
