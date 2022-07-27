package DSA.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        for (int[] x : matrix) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
        int[][] ans = SetZeroes(matrix);
        for (int[] x : ans) {
            System.out.println(Arrays.toString(x));
        }
    }

    public static int[][] setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < row.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row.get(i)][j] = 0;
            }
        }
        for (int j = 0; j < col.size(); j++) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col.get(j)] = 0;
            }
        }
        return matrix;
    }

    public static int[][] SetZeroes(int[][] matrix) {
        boolean x = false, y = false;
        for (int j = 0; j < matrix[0].length; j++) {

//            For the first row and column elements this is the check ki unhe 0 banana hai ya nahi
            if (matrix[0][j] == 0) {
                x = true;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                y = true;
                break;
            }
        }

//      Finding the 0 elements and marking there rows and columns
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0)
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
        }
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (x) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (y) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        return matrix;
    }
}
