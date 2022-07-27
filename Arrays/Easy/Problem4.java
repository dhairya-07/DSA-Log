package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[][] accounts = {{7, 8, 9}, {4, 5, 6}};
        System.out.println(maxWealth(accounts));
    }

//    This one is faster --> don't know why
    static int MaxWealthAcc(int[][] accounts) {
        int max = -1;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max=Math.max(max, sum);
        }
        return max;
    }

    static int maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] i : accounts) {
            if (Arrays.stream(i).sum() > max)
                max = Arrays.stream(i).sum();
        }
        return max;
    }
}
