package Arrays1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArraysUnion {

    public static int[] arraysUnion(int[] arr1, int[] arr2){

        Set<Integer> s = new TreeSet<>();
        for (int x : arr1){
            s.add(x);
        }
        for (int y : arr2){
            s.add(y);
        }
        int[] resArr = new int[s.size()];

        int index = 0;
        for (int a : s){
            resArr[index] = a;
            index++;
        }
        return resArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {3,5,2,4};

        System.out.println(Arrays.toString(arraysUnion(arr1,arr2)));
    }
}
