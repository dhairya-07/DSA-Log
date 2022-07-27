package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem25 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        MatrixReshape(mat, 1, 4);
    }

    //    Taking double time and extra space
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[r][c];
        if (r * c != m * n)
            return mat;
        else {
            int k = 0;
            int[] temp = new int[m * n];
            for (int[] x : mat) {
                for (int y : x) {
                    temp[k++] = y;
                }
            }
            k = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ans[i][j] = temp[k++];
                }
            }
        }
        return ans;
    }

    public static int[][] MatrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        int[][] ans = new int[r][c];
        if (r * c != m * n)
            return mat;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return ans;
    }
}
