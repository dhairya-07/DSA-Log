package DSA.Searching.Medium;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4, 5};
        System.out.println(Arrays.toString(searchRange(arr, 3)));
    }

    public static int[] searchRange(int[] nums, int target) {
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
