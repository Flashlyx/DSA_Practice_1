package Basic_Problems;

public class Largest_Element_In_Array {
    public static int largestElementInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {12,4,6,2,80,900,5,10,12,-1000};
        System.out.println(largestElementInArray(arr1));
    }
}
