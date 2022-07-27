package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem26 {
    public static void main(String[] args) {
        int[] digit = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digit)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
