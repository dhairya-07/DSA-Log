package DSA.Arrays.Easy;

public class Problem15 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(DiagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    sum += mat[i][j];
                else if (j == n - i - 1)
                    sum += mat[i][j];
            }
        }
        return sum;
    }

    public static int DiagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
//        int i = 0, j = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - i - 1];
        }
        if (n % 2 == 1)
            return sum - mat[n / 2][n / 2];
        else
            return sum;
    }
}
