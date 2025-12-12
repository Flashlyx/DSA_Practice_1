package Arrays1;


import java.util.Arrays;

public class BinarySearch_Inbuilt {
    public static int binarySearchInBuilt(int[] arr, int target){
        Arrays.sort(arr);

        return Arrays.binarySearch(arr,target);
    }

    public static void main(String[] args) {
        int[] arr1 = {5,8,2,3,1,8};

        // Sorted  =  1,2,3,5,8,8

        System.out.println(binarySearchInBuilt(arr1,3));
    }
}
