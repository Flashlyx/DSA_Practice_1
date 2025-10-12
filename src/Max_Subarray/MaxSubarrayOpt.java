package Max_Subarray;

public class MaxSubarrayOpt {
    public static int maxSubarrayOpt(int[] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int globalMax = 0;
        int currentMax = 0;

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            currentMax = Math.max(num, currentMax + num);

            if (currentMax > globalMax){
                globalMax = currentMax;
            }
        }
        return globalMax;
    }
    public static void main(String[] args){
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {5, 4, -1, 7, 8};
        int[] nums3 = {1,2,3,4,5};

        System.out.println(maxSubarrayOpt(nums1));
        System.out.println(maxSubarrayOpt(nums2));
        System.out.println(maxSubarrayOpt(nums3));
    }
}
