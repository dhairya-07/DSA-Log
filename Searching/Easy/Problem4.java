package DSA.Searching.Easy;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1};
        System.out.println(Arrays.toString(twoSum(nums, 0)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            if (numbers[start] + numbers[end] > target)
                end--;
            else if (numbers[start] + numbers[end] < target)
                start++;
            else return new int[]{start + 1, end + 1};
        }
        return new int[]{-1, -1};
    }

}
