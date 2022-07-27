package DSA.Arrays.Medium;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 9, 9, 9, 9, 10, 10};
//        System.out.println(Arrays.toString(SearchRange(nums, 8)));
        int[] ans = SearchRange(nums, 9);
        System.out.println(Arrays.toString(ans));
    }

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

    //    Binary search wala method
    public static int[] SearchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, int target, boolean FirstOccurance) {
        int ans = -1;
        int start = 0, end = nums.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
//                Potential ans
                ans = mid;
                if (FirstOccurance)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
