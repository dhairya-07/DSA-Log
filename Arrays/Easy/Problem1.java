package DSA.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;


public class Problem1 {
    public static void main(String[] args) {
        int[] nums = new int[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 6; i++)
            nums[i] = in.nextInt();
        int[] ans = BuildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

//    Brute force approach
//     --> time=O(1)  space= O(n)
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;

    }

//    time= same   space=O(1)
    public static int[] BuildArray(int[] nums) {
        int n = nums.length;
//        z = a+b*n
//        a=z/n      ||   b=z%n
        for (int i = 0; i < n; i++)
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
        for (int i = 0; i < n; i++)
            nums[i] = nums[i] / n;
        return nums;
    }
}