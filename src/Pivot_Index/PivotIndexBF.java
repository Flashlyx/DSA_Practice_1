package Pivot_Index;

public class PivotIndexBF {
    public static int pivotIndexBF(int[] nums) {

        for(int i = 0; i < nums.length; i++){

            int leftSum = 0;
            for(int x = 0; x < i; x++){
                leftSum = leftSum + nums[x];
            }

            int rightSum = 0;
            for(int y = i + 1; y < nums.length; y++){
                rightSum = rightSum + nums[y];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        int[] nums1 = {1,7,3,6,5,6};
        System.out.println(pivotIndexBF(nums1));

        int[] nums2 = {2,1,-1};
        System.out.println(pivotIndexBF(nums2));

        int[] nums3 = {1,2,3};
        System.out.println(pivotIndexBF(nums3));
    }
}
