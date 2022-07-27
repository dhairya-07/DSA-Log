package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        int[] ans = Arrayconcat(nums);
        System.out.println(Arrays.toString(ans));
    }

//    Method 1
    static int[] BuildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

//    Method 2
    static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }

//Method 3
    static int[] Arrayconcat(int[] nums){
        int n = nums.length;
        int[] ans = new int[2 * n];
        int k=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<n;j++)
                ans[k++]=nums[j];
        }
        return ans;
    }
}