package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem22 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }

    public static int[] sumZero(int n) {
        int ans[] = new int[n];
        int j = 0;
        for (int i = 1; i <= n / 2; i++) {
            ans[j++] = i;
            ans[j++] = i * -1;
        }
        if (n % 2 == 1)
            ans[j++] = 0;
        return ans;
    }

    static int[] SumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n / 2; i++) {
            result[i] = i + 1;
            result[n - i - 1] = (i + 1) * -1;
        }
        return result;
    }
}
