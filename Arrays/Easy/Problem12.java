package DSA.Arrays.Easy;

import java.sql.Array;
import java.util.Arrays;

public class Problem12 {
    public static void main(String[] args) {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(LargestALtitude(gain));

    }

    //    Dono hi solution theek hai marzi hai koi bhi use karo
    public static int largestAltitude(int[] gain) {
        int[] temp = new int[gain.length + 1];
        for (int i = 1; i < gain.length; i++) {
            gain[i] += gain[i - 1];
        }
        for (int i = 1; i <= gain.length; i++) {
            temp[i] = gain[i - 1];
        }
        int ans = 0;
        for (int x : temp) {
            if (ans < x)
                ans = x;
        }

        return ans;
    }

    public static int LargestAltitude(int[] gain) {
        for (int i = 1; i < gain.length; i++) {
            gain[i] += gain[i - 1];
        }

        int ans = 0;
        for (int x : gain) {
            if (ans < x)
                ans = x;
        }

        if (ans > 0)
            return ans;
        else
            return 0;
    }

    public static int LargestALtitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            max = Math.max(current, max);
        }
        return max;
    }
}
