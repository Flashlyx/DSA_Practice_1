package Arrays1;

import java.util.Arrays;

public class AddNumInArray {
    public static int addNum(int num){
        int sum = 0;
        while (num != 0){
            int remainder = num % 10;
            sum = sum + remainder;

            num = num / 10;
        }
        return sum;
    }
    public static int[] addNumInArray(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            res[i] =  addNum(arr[i]);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr1 = { 1234, 5555, 42315};
        System.out.println(Arrays.toString(addNumInArray(arr1)));

        int[] arr2 = { 32523525, 244 , 5 , 10 , 333};
        System.out.println(Arrays.toString(addNumInArray(arr2)));


    }

}
