package DSA.Searching.Medium;

import java.util.Arrays;

public class Problem15 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 6, 4};
//        findDuplicate(nums);
        System.out.println(findDuplicate(nums));
    }

//    Hare and tortoise method seekho and use karo jaise cyclic linked list me use karte hai
//    Space and time both are O(n)
    public static int findDuplicate(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
//        System.out.println(maxi);
        char[] temp = new char[maxi + 1];
//        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] ^= 1;
            if (temp[nums[i]] == 0) {
                return nums[i];
            }
        }
        return -1;
    }
}
