package DSA.Searching.Easy;

import java.util.Arrays;

public class Problem11 {
    public static void main(String[] args) {
        int[] alice = {1, 2, 5};
        int[] bob = {2, 4};
        System.out.println(Arrays.toString(fairCandySwap(alice, bob)));
    }

    //HashSet seekhne ke baad revisit karna
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0, sum2 = 0;
        for (int x : aliceSizes)
            sum1 += x;
        for (int y : bobSizes)
            sum2 += y;

        int avg = (sum1 + sum2) / 2;


        int i = aliceSizes.length - 1;
        while (i >= 0) {
            int x = search(bobSizes, avg - (sum1 - aliceSizes[i]));
            if (x != -1)
                return new int[]{aliceSizes[i], x};
            else
                i--;
        }
        return new int[]{-1, -1};
    }

    public static int search(int[] candies, int target) {
        int start = 0, end = candies.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (candies[mid] == target)
                return candies[mid];
            else if (candies[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
