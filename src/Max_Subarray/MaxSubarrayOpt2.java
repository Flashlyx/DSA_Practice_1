package Max_Subarray;

import java.util.Arrays;

public class MaxSubarrayOpt2 {
    public static int[] maxSubarrayOpt2(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("no subarray found");
        }

        int globalMax = nums[0];
        int currentMax = nums[0];
        int start = 0, end = 0;
        int tempStart = 0;


        for (int i = 1; i < nums.length; i++) {

            if (currentMax < 0){
                currentMax = nums[i];
                tempStart = i;
            }
            else {
                currentMax = currentMax + nums[i];
            }

            if (currentMax > globalMax){
                globalMax = currentMax;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("Max Value = "+globalMax);
        return Arrays.copyOfRange(nums, start, end + 1) ;

    }
    public static void main(String[] args){
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {5, 4, -1, 7, 8};
        int[] nums3 = {1,2,3,4,5};

        System.out.println(Arrays.toString(maxSubarrayOpt2(nums1)));
        System.out.println(Arrays.toString(maxSubarrayOpt2(nums2)));
        System.out.println(Arrays.toString(maxSubarrayOpt2(nums3)));
    }
}
