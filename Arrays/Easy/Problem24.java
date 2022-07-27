package DSA.Arrays.Easy;

public class Problem24 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = MaxSubArray(nums);
        System.out.println(ans);
    }

    //    T=O(n^2)
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    //    Divide and conquer approach
//    T=O(n)
    public static int MaxSubArray(int[] nums) {
        int bestsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < nums.length; i++) {
            currsum = Math.max(nums[i], currsum + nums[i]);
            bestsum = Math.max(currsum, bestsum);
        }
        return bestsum;
    }
}
