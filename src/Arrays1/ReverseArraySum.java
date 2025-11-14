package Arrays1;

import java.util.Arrays;

public class ReverseArraySum {
    public static int[] reverseArrayIfSecondSumIsGreater(int[] arr){

        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < (arr.length / 2); i++){
            firstHalfSum += arr[i];
        }
        for (int i = (arr.length / 2); i < arr.length; i++){
            secondHalfSum += arr[i];
        }

        if (secondHalfSum > firstHalfSum){
            reverseArray(arr);
        }
        return arr;
    }
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 23, 2, 6};
        System.out.println(Arrays.toString(reverseArrayIfSecondSumIsGreater(arr1)));

        int[] arr2 = {200, 5, 6, 4, 2, 6};
        System.out.println(Arrays.toString(reverseArrayIfSecondSumIsGreater(arr2)));

    }
}
