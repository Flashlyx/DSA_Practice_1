package Jspiders_Programming.Missing_Ele_In_SeqArray;

import java.util.Arrays;

public class One_Missing_Ele {
    public static int oneMissingElementInSeqArray(int[] arr){
        Arrays.sort(arr);
        int sum = 0;
        int maxNum = arr[arr.length - 1];

        int res = maxNum * ((maxNum + 1)/2);

        for (int j : arr) {
            sum = sum + j;
        }

        return res - sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,6,7};

        System.out.println(oneMissingElementInSeqArray(arr1));
    }
}
