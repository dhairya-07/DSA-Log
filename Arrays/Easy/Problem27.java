package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem27 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(RemoveDuplicates(nums));
    }

    static int RemoveDuplicates(int[] nums) {
        int i = 0;
        if (nums.length == 0)
            return 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
