package DSA.Arrays.Easy;

public class Problem14 {
    public static void main(String[] args) {
        int[][] indices = {{0, 1}, {1, 1}};
        int ans = oddCells(2, 3, indices);
        System.out.println(ans);
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int ans = 0;
        int[][] mat = new int[m][n];
        for (int[] x : indices) {
            int i = 0, j = 0;
            while (i < n) {
                mat[x[0]][i]++;
                i++;
            }
            while ((j < m)) {
                mat[j][x[1]]++;
                j++;
            }

        }

        for (int[] x : mat) {
            for (int y : x) {
                if (y % 2 == 1)
                    ans++;
            }
        }

        return ans;
    }

    static int OddCells(int m, int n, int[][] indices) {
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]] ^= true;
            col[indices[i][1]] ^= true;
        }
        int r = 0, c = 0;
        for (int i = 0; i < m; i++) {
            if (row[i])
                r++;
        }
        for (int j = 0; j < n; j++) {
            if (col[j])
                c++;
        }

        return r * n + c * m - 2 * r * c;
    }
}
