package SubArray.MaxSubArrayFixedLength;

import java.util.Arrays;

public class MaxSubArrayOpt {
    public static int maxSubArrayOpt(int[] nums, int k){
        int maxSum;
        int currentSum = 0;

        for (int i = 0; i < k; i++){
            currentSum += nums[i];
        }
        maxSum = currentSum;

        for (int i = k; i < nums.length; i++){
            currentSum = currentSum + nums[i] - nums[i-k];

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums1 = {2,8,4,1,9,1,8,3,1};
        int k1 = 3;

        System.out.println(Arrays.toString(nums1));

        int subarr2 = maxSubArrayOpt(nums1, k1);
        System.out.println(subarr2);
    }
}
