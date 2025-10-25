package RangeSumQuery;

public class RangeSumQueryOpt {
    private int[] prefixSum;
    public RangeSumQueryOpt(int[] nums){
        if (nums == null || nums.length == 0){
            return;
        }
        this.prefixSum = new int[nums.length];

        this.prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++){
            this.prefixSum[i] = this.prefixSum[i - 1] + nums[i];
        }
    }
    public int sumRangeOpt(int start, int end){
        if (start == 0){
            return this.prefixSum[end];
        }
        return this.prefixSum[end] - this.prefixSum[start - 1];
    }

    public static void main(String[] args){
        int[] nums = {-2, 0, 3, -5, 2, -1};

        RangeSumQueryOpt r1 = new RangeSumQueryOpt(nums);
        int res1 = r1.sumRangeOpt(2,5);
        System.out.println(res1);
    }

}
