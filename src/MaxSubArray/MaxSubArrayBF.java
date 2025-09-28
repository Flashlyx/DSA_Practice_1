package MaxSubArray;

public class MaxSubArrayBF {

    public static int maxSubArrayBF(int[] nums, int k){
        int maxSum = 0;

        for (int i = 0; i < nums.length - k; i++){
            int currentSum = 0;


            for (int j = i; j < i + k; j++){
                currentSum += nums[j];
            }
            if (maxSum < currentSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] nums1 = {2,8,4,1,9,1,7,3,1};
        int k1 = 3;

        int subarr1 = maxSubArrayBF(nums1, k1);
        System.out.println(subarr1);
    }
}
