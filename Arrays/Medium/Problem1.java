package DSA.Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> list = spiralOrder(matrix);
        System.out.println(list);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        if (bottom + 1 == 0)
            return list;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
//            This and below if condition is vv imp to check ki kahi koi element repeat na ho
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }

    //    d ko direction number maan lo ki 0 for left-right 1 for top-bottom and.....
    public static List<Integer> SpiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        int d = 0;
        if (bottom + 1 == 0)
            return list;

        while (top <= bottom && left <= right) {
            if (d == 0) {
                for (int j = left; j <= right; j++)
                    list.add(matrix[top][j]);

                d = 1;
                top++;
            } else if (d == 1) {
                for (int i = top; i <= bottom; i++)
                    list.add(matrix[i][right]);
                d = 2;
                right--;
            } else if (d == 2) {
                for (int j = right; j >= left; j--)
                    list.add(matrix[bottom][j]);

                d = 3;
                bottom--;
            } else if (d == 3) {
                for (int i = bottom; i >= top; i--)
                    list.add(matrix[i][left]);

                d = 0;
                left++;
            }
        }

        return list;
    }
}
