package TwoSum;

import java.util.Arrays;

public class TwoSumBF {
    public static int[] twoSumBF(int[] nums, int target){

        for (int i = 0; i <= nums.length; i++){
            for (int j = i + 1; j <= nums.length; j++){

                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        int[] nums1 ={2,5,8,3,7};
        int target1 = 9;
        int[] res = twoSumBF(nums1, target1);
        System.out.println(Arrays.toString(res));
    }
}
