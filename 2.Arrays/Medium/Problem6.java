//package Arrays;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

//    Binary search seekh ke ye que kario
//    T=O(n) and constant space
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if (nums.length == 0)
            return ans;
        if (nums.length == 1) {
            if (nums[0] == target) {
                ans[0] = 0;
                ans[1] = 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && ans[0] == -1) {
                ans[0] = i;
            }
            if (nums[i] == target && ans[0] != -1) {
                ans[1] = i;
            }
        }
        return ans;
    }
}
