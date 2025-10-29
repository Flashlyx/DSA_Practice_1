package Pivot_Index;

public class PivotIndexOpt {
    public static int pivotIndexOpt(int[] nums){

        int totalSum = 0;

        for (int i:nums){ // Enhanced for loop( for int 'i' in mums = 'i' in total length of 'nums' array;
            totalSum = totalSum + i ;
        }

        int leftSum = 0;

        for(int j = 0; j < nums.length; j++){

            int rightSum = totalSum - leftSum - nums[j];

            if (leftSum == rightSum){
                return j;
            }

            leftSum = leftSum + nums[j];
        }
        return -1;
    }
    public static void main(String [] args){
        int[] nums1 = {1,7,3,6,5,6};
        System.out.println(pivotIndexOpt(nums1));

        int[] nums2 = {2,1,-1};
        System.out.println(pivotIndexOpt(nums2));

        int[] nums3 = {1,2,3};
        System.out.println(pivotIndexOpt(nums3));
    }
}
