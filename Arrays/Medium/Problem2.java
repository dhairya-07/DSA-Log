package DSA.Arrays.Medium;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[][] ans = generateMatrix(1);
        for (int[] x : ans)
            System.out.println(Arrays.toString(x));
    }

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1, d = 0;
        int num = 1;
        while (top <= bottom && left <= right) {
            if (d == 0) {
                for (int i = left; i <= right; i++)
                    res[top][i] = num++;
                d = 1;
                top++;
            } else if (d == 1) {
                for (int i = top; i <= bottom; i++)
                    res[i][right] = num++;
                d = 2;
                right--;
            } else if (d == 2) {
                for (int i = right; i >= left; i--)
                    res[bottom][i] = num++;
                d = 3;
                bottom--;
            } else if (d == 3) {
                for (int i = bottom; i >= top; i--)
                    res[i][left] = num++;
                d = 0;
                left++;
            }
        }
        return res;
    }

    public static int[][] GenerateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1, d = 0;
        int num = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                res[top][i] = num++;
            top++;

            for (int i = top; i <= bottom; i++)
                res[i][right] = num++;
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    res[bottom][i] = num++;
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    res[i][left] = num++;
                left++;
            }
        }
        return res;
    }
}
