package Jspiders_Programming.Missing_Ele_In_SeqArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Multi_Missing_Ele {
    public static void multiMissingEleInSeqArray(int[] arr){
        Arrays.sort(arr);

        ArrayList al = new ArrayList();

        for (int x : arr){
            al.add(x);
        }

        for (int i = arr[0]; i < arr[arr.length - 1]; i++){
            if (!al.contains(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,7,11};

        multiMissingEleInSeqArray(arr1);
    }
}
