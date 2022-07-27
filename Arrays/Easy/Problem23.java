package DSA.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem23 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        luckyNumbers(matrix);
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = 1000001;
            int minIndx = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndx = j;
                }
            }
            boolean isTrue = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][minIndx] < matrix[j][minIndx]) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue)
                list.add(matrix[i][minIndx]);
        }
        return list;
    }
}
