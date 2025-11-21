package Basic_Problems;

import java.util.Arrays;

public class Remove_Duplicates_Array {
    public static int[] removeDuplicatesInArray(int[] arr){

        Arrays.sort(arr);

        int index = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                arr[index = index + 1] = arr[i];
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++){
            result[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,7,2,4,1,6,4,8,3};
        System.out.println(Arrays.toString(removeDuplicatesInArray(arr1)));

        int[] arr2 = {5,3,78,3,78,-10,50};
        System.out.println(Arrays.toString(removeDuplicatesInArray(arr2)));
    }
}
