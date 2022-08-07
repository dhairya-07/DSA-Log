package DSA.Searching.Medium;

import java.util.Arrays;

public class Problem13 {
    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        System.out.println(Arrays.toString(findPeakGrid(mat)));
//        int[] temp={7,5,6,8,2,3};
//        System.out.println(FindPeak(mat, 0));

    }

    public static int[] findPeakGrid(int[][] mat) {
        int start = 0, end = mat.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int peak = FindPeak(mat, mid);
            if (mid == 0 && mat[mid][peak] > mat[mid + 1][peak]) {
                return new int[]{mid, peak};
            }
            if (mid == mat.length - 1 && mat[mid][peak] > mat[mid - 1][peak]) {
                return new int[]{mid, peak};
            }
            if (mat[mid][peak] > mat[mid + 1][peak] && mat[mid][peak] > mat[mid - 1][peak])
                return new int[]{mid, peak};
            if (mat[mid][peak] > mat[mid + 1][peak])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return new int[]{-1, -1};
    }

    static int FindPeak(int[][] mat, int row) {
        int index = 0, max = 0;
        for (int i = 0; i < mat[0].length; i++) {
            if (max < mat[row][i]) {
                max = mat[row][i];
                index = i;
            }
        }
        return index;
    }
}
