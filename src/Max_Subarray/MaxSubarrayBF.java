package Max_Subarray;

public class MaxSubarrayBF {

    public static int maxSubarrayBF(int[] nums){
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            int currentSum = 0;

            for (int j = i; j < nums.length;j++){

                currentSum = currentSum + nums[j];

                if (currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {5, 4, -1, 7, 8};
        int[] nums3 = {1,2,3,4,5};

        System.out.println(maxSubarrayBF(nums1));
        System.out.println(maxSubarrayBF(nums2));
        System.out.println(maxSubarrayBF(nums3));
    }
}
