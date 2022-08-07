package DSA.Searching.Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;


//To be continued
//Hashmap use karna seekho fir karna
public class Problem11 {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 5};
        int[] nums2 = {2, 3, 5};
        System.out.println(minAbsoluteSumDiff(nums1, nums2));
    }

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
//        This is something given in question
        int M = 1000000007;
        HashMap<Integer, Integer> diff = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            diff.put(Math.abs(nums1[i] - nums2[i]), i);
//            Modulo isliye taki large numbers me integer overflow na ho jaye
            sum += Math.abs(nums1[i] - nums2[i]) % M;
        }
        int maxDiff = Collections.max(diff.values());
        sum -= maxDiff;
        int targetIndex = diff.get(maxDiff);
        Arrays.sort(nums1);
        int Floor = CeilOrFloor(nums1, nums2[targetIndex], true);
        int Ceil = CeilOrFloor(nums1, nums2[targetIndex], false);
        int diff1 = Math.abs(nums1[Floor] - nums2[targetIndex]);
        int diff2 = Math.abs(nums1[Ceil] - nums2[targetIndex]);
        sum += diff1 > diff2 ? diff1 : diff2;
        return sum;

    }

    static int CeilOrFloor(int[] nums1, int target, boolean Floor) {
        int start = 0, end = nums1.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums1[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        if (Floor)
            return end;
        return start;
    }
}
