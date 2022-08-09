package DSA.Searching.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem17 {
    public static void main(String[] args) {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        System.out.println(Arrays.toString(fourSum(nums, -294967296).toArray()));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length == 0)
            return res;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long target_2 = (long)target - nums[i] - nums[j];
                int front = j + 1, back = n - 1;
                while (front < back) {
                    if (nums[front] + nums[back] > target_2)
                        back--;
                    else if (nums[front] + nums[back] < target_2)
                        front++;
                    else {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);

//                        Skipping the duplicates for the back wale elements
                        while (front < back && nums[back] == quad.get(3))
                            --back;
//                        Skipping the duplicates for the front wale element/s
                        while (front < back && nums[front] == quad.get(2))
                            ++front;
                    }
                }
//                Skipping the duplicates for the j wale elements
                while (j + 1 < n && nums[j] == nums[j + 1])
                    ++j;
            }
//            Skipping the duplicates for the i wale elements
            while (i+1 < n && nums[i] == nums[i + 1])
                ++i;
        }
        return res;
    }
}
