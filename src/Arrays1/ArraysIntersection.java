package Arrays1;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArraysIntersection {

    public static int[] arraysIntersection(int[] arr1, int[] arr2){

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    return new int[]{i};
                }
            }
        }
        throw new NoSuchElementException("No common Elements Found !");
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {3,5,2,4};

        System.out.println(Arrays.toString(arraysIntersection(arr1,arr2)));
    }
}
