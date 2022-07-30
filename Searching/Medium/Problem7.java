package DSA.Searching.Medium;

import java.util.Arrays;
import java.util.HashMap;

// 1 test case clear nahi ho raha pata nahi kyu
public class Problem7 {
    public static void main(String[] args) {
        int[][] intervals = {{3, 4}, {2, 3}, {1, 2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }

    public static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        if (intervals.length == 1) {
            if (intervals[0][0] >= intervals[0][1])
                return new int[]{0};
            else
                return new int[]{-1};
        }
        int x = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] sorted = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            hashMap.put(intervals[i][0], i);
            sorted[i] = intervals[i][0];
        }
        Arrays.sort(sorted);
        for (int i = 0; i < intervals.length; i++) {
            x = FindCeil(sorted, intervals[i][1]);
            if (x == sorted.length)
                ans[i] = -1;
            else
                ans[i] = hashMap.get(sorted[x]);
        }
        return ans;
    }

    static int FindCeil(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
}
