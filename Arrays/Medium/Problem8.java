package DSA.Arrays.Medium;

import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }


    static void swap(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s++] = nums[e];
            nums[e--] = temp;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        swap(nums, 0, n - k - 1);
        swap(nums, n - k, n - 1);
        swap(nums, 0, n - 1);
    }

    // Isme space =O(n) but this is faster than above
    public static void Rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int offset = n - k;
        int[] temp = new int[n];
        System.arraycopy(nums, offset, temp, 0, k);
        System.arraycopy(nums, 0, temp, k, offset);
        System.arraycopy(temp, 0, nums, 0, n);
    }
}
