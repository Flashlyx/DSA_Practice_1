package SubArray.CountSubArray;

public class CountValidSubArray {
    public static int countValidSubArray(int[] arr){
        int count = 0;

        for (int i = 1; i < arr.length - 1; i++){
            if (arr[i] == arr[i - 1] + arr[i + 1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,1,3,5,2,4,2};
        System.out.println(countValidSubArray(arr1));
    }
}
