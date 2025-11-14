package PermutationArray;

import java.util.Arrays;

public class PermutationArray {

    public static int validPermutation(int n, int[] arr){
        Arrays.sort(arr);
        int operations = 0;

        for (int i = 0; i < n; i++){
            int target = i + 1;

            if (arr[i] < target){
                operations = operations + (target - arr[i]);
                arr[i] = target;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,1,3,3,4,2,4}; // Sort - {1,1,2,3,3,4,4}
        System.out.println(validPermutation(n,arr));
        System.out.println(Arrays.toString(arr));
    }
}
