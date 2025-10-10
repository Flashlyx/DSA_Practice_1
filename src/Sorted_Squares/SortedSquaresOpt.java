package Sorted_Squares;

import java.util.Arrays;

public class SortedSquaresOpt {
    public static int[] sortedSquaresOpt(int[] arr){
        int n = arr.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--){

            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare){
                result[i] = leftSquare;
                left++;
            }else {
                result[i] = rightSquare;
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-3,0,3,5,10};
        int[] res = sortedSquaresOpt(arr);
        System.out.println(Arrays.toString(res));
    }
}
