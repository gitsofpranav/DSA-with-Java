public class prefix_sum {
    public static int[] compute_prefix(int nums[]) {
        int prefix_sum[] = new int[nums.length];
        prefix_sum[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            prefix_sum[i] = prefix_sum[i-1] + nums[i];
        }
        return prefix_sum;
      }
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        System.out.println("prefix sum is : " +compute_prefix(nums));
    }
}
