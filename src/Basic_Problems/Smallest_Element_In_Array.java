package Basic_Problems;

public class Smallest_Element_In_Array {
    public static int smallestElementInArray(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr1 = {12,4,6,2,80,900,5,10,12};
        System.out.println(smallestElementInArray(arr1));
    }
}

