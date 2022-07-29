package DSA.Searching.Easy;

import java.util.Arrays;

public class Problem13 {
    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0, 4};
        System.out.println(specialArray(nums));
    }

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
//        int x = nums.length;
        for (int i = 1; i <= nums.length; i++) {
            if (FindFloor(nums, i) == i)
                return i;
        }
        return -1;
    }

    public static int FindFloor(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        if (mid == -1)
            return nums.length;
        return (nums.length - 1) - end;
    }
}
