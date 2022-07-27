package DSA.Arrays.Medium;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
//        PRoductExceptSelf(nums);
    }

    //T=O(n) space =O(n) because left and right product wale array use kiye
    public static int[] ProductExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int product = 1;

        for (int i = 0; i < n; i++) {
            product *= nums[i];
            leftProduct[i] = product;
        }

        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            product *= nums[i];
            rightProduct[i] = product;
        }

        for (int i = 1; i < n - 1; i++) {
            ans[i] = leftProduct[i - 1] * rightProduct[i + 1];
        }
        ans[0] = rightProduct[1];
        ans[n - 1] = leftProduct[n - 2];
        return ans;
    }

    //    T=O(n) space is constant because koi extra array use nahi kiya
//    Jo returning array hota hai use space complexity me count nahi karte
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int product = 1;

        for (int i = 0; i < n; i++) {
            product *= nums[i];
            ans[i] = product;
        }

        product = 1;
        for (int i = n - 1; i > 0; i--) {
            ans[i] = product * ans[i - 1];
            product *= nums[i];
        }
        ans[0] = product;
        return ans;
    }
}
