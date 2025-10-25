package RangeSumQuery;

public class RangeSumQueryBF {
    private int[] nums;

    public RangeSumQueryBF(int[] nums){
        this.nums = nums;
    }
    public int sumRange(int start, int end){
        int sum = 0;

        for (int i = start; i <= end; i++){
            sum = sum + this.nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums = {-2, 0, 3, -5, 2, -1};

        RangeSumQueryBF r1 = new RangeSumQueryBF(nums);
        int res1 = r1.sumRange(0,5);
        System.out.println(res1);



    }
}
