package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOpt {

    public static int[] twoSumOpt(int[] nums, int target){
        Map<Integer, Integer> numMap= new HashMap<>();

        for (int i = 0; i <= nums.length; i++){

            int pair = target - nums[i];

            if (numMap.containsKey(pair)){
                return new int[]{numMap.get(pair), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
    public static void main(String[] args){
        int[] nums1 = {4,2,6,5,1};
        int target1 = 11;

        int[] res = twoSumOpt(nums1, target1);
        System.out.println(Arrays.toString(res));
    }
}
