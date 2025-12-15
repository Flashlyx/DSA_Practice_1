package Jspiders_Programming.Nth_Min_Value_Array;

public class Nth_Min_Value {
    public static int nthMinValueInArray(int[] arr){
        int min1 = 50, min2 = 51;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }
        return min2;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,6,9,7,5,8};

        System.out.println(nthMinValueInArray(arr1));
    }
}
