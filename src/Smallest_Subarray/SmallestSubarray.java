package Smallest_Subarray;

public class SmallestSubarray {
    public static int smallestSubarrayBF(int[] nums, int target){
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            int currentSum = 0;

            for (int j = i; j < nums.length; j++){
                currentSum = currentSum + nums[j];
                if (currentSum >= target){
                    int currentLength = j - i + 1;
                    minLength = Math.min(minLength, currentLength);
                    break;
                }
            }
        }
        return (minLength == Integer.MAX_VALUE ? 0 : minLength);
    }
    public static void main(String[] args){
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        int res1 = smallestSubarrayBF(nums1,target1);
        System.out.println(res1);

        int[] nums2 = {5,4,2,9,1,0,2,5,4,7,11};
        int target2 = 11;
        int res2 = smallestSubarrayBF(nums2,target2);
        System.out.println(res2);
    }
}
