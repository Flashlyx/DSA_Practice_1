package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr, int lowIndex, int highIndex){

        int j = lowIndex - 1;

        for (int i = lowIndex; i <= highIndex; i++)

            if (arr[i] <= arr[highIndex]){
                j++;

                //Swap ( arr[i] , arr[j] )
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        return j;
    }

    public  static void quickSort(int[] arr, int lowIndex, int highIndex){

        if (lowIndex < highIndex){
            int pivotIndex = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, pivotIndex - 1);
            quickSort(arr,pivotIndex + 1, highIndex);
        }

    }


    public static void main(String[] args) {

        int[] arr1 = {3,6,1,7,9,0,2,4,5,8};
        System.out.println("Array : " + Arrays.toString(arr1));

        quickSort(arr1,0, arr1.length -1);
        System.out.println("After Quick Sort : " + Arrays.toString(arr1));
    }
}
