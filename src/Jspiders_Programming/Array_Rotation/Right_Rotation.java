package Jspiders_Programming.Array_Rotation;

import java.util.Arrays;

public class Right_Rotation {
    public static int[] rightArrayRotation(int[] arr, int k){

        // k % arr.length reduces repetitions of rotations
        k = k % arr.length;

        int[] res = new int[arr.length];
        // arr  =  {1,2,3,4,5}
        // index -  0,1,2,3,4
        // k = 3

        for (int i = 0; i < arr.length; i++){
            if (i + k > arr.length){
                res[i] = arr[i - k];
            }
            else{
                res[i] = arr[i - k + arr.length];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int k1 = 3;

        System.out.println(Arrays.toString(rightArrayRotation(arr1,k1)));

        int[] arr2 = {20,40,60,50,10};
        int k2 = 3;

        System.out.println(Arrays.toString(rightArrayRotation(arr2,k2)));
     }
}
