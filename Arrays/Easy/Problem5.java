package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] sh = shuffle(nums, nums.length / 2);
        System.out.println(Arrays.toString(sh));
    }


    static int[] Shuffle(int[] nums, int n) {
        int[] sh = new int[2 * n];
        int j = 0;
        for (int i = 0; i < 2 * n; i += 2) {
            sh[i] = nums[j];
            sh[i + 1] = nums[j + n];
            j++;
        }
        return sh;
    }

//    Bitwise operation wala sol dekhke dalna isme

    static int[] shuffle(int[] nums, int n) {
        int k = 10000;
        for (int i = 0; i < n; i++) {
            nums[i + n] += nums[i] * k;
        }
        for (int i = 0; i < n; i++) {
            nums[2 * i] = nums[n + i] / k;
            nums[2 * i + 1] = nums[n + i] % k;
        }
        return nums;
    }
}
