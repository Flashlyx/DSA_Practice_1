package Smallest_Subarray;

public class SmallestSubarrayOpt {
    public static int smallestSubarrayOpt(int[] nums, int target){

        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int startPoint=0;

        for (int endPoint = 0; endPoint < nums.length; endPoint++){
            currentSum = currentSum + nums[endPoint];

            while(currentSum >= target){
                int currentLength = endPoint - startPoint + 1;
                minLength = Math.min(currentLength, minLength);
                currentSum = currentSum - nums[startPoint];
                startPoint++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
    public static void main(String[] args){
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        int res1 = smallestSubarrayOpt(nums1,target1);
        System.out.println(res1);

        int[] nums2 = {5,4,2,9,1,0,2,5,4,7,11};
        int target2 = 11;
        int res2 = smallestSubarrayOpt(nums2,target2);
        System.out.println(res2);
    }
}
