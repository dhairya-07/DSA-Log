package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] ans = SmallerThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    //    Brute force
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int cnt = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[i] > nums[j])
                    cnt++;
            }
            ans[i] = cnt;
            cnt = 0;
        }
        return ans;
    }

    //    time optimised
    static int[] SmallerThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] temp = new int[101];

//        Finding frequency of numbers
        for (int i = 0; i < n; i++)
            temp[nums[i]]++;

//        Running sum
        for (int i = 1; i < 101; i++)
            temp[i] += temp[i - 1];

//        For storing ans
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = temp[nums[i] - 1];
            }
        }
        return res;
    }
}
