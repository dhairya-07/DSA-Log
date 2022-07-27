 package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] target = TargetArray(nums, index);
        System.out.println(Arrays.toString(target));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        for (int i = 0; i < n; i++)
            target[i] = -1;

        for (int i = 0; i < n; i++) {
            if (target[index[i]] == -1) {
                target[index[i]] = nums[i];
            } else {
                for (int j = n - 2; j >= index[i]; j--) {
                    target[j + 1] = target[j];
                }
                target[index[i]] = nums[i];
            }
        }
        return target;
    }

    static int[] TargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];

        for (int i = 0; i < index.length; i++) {
            for(int j=index.length-2;j>=index[i];j--){
                target[j+1]=target[j];
            }
            target[index[i]]=nums[i];
        }
        return target;
    }
}
