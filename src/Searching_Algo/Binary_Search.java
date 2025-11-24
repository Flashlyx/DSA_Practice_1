package Searching_Algo;

public class Binary_Search {

    public static int binarySearch(int[] arr, int targetNum){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == targetNum){
                return mid;
            }

            if (targetNum < arr[mid]){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr1 = {3,5,7,8,9};
        //            0 1 2 3 4

        System.out.println(binarySearch(arr1,5)); // 1

        int[] arr2 = {5,15,25,30,45,65,80,95,200};
        //            0  1  2  3  4  5  6  7  8
        System.out.println(binarySearch(arr2,95)); // 7
    }
}
