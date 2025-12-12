package Arrays1;

import java.util.Arrays;

public class Array_Negatives_First {

    public static int[] arrayNegativesFirst(int[] arr){
        // create new array - temp
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length;i++){
            if (arr[i] < 0){
                temp[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length;i++){
            if (arr[i] >= 0){
                temp[index++] = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {-1,4,-6,7,0,2,-4,-7};

        System.out.println(Arrays.toString(arrayNegativesFirst(arr)));
    }
}
