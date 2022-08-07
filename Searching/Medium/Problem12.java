package DSA.Searching.Medium;

public class Problem12 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60},
        };
        System.out.println(searchMatrix(matrix, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean isPresent = false;
        int rows = matrix.length, cols = matrix[0].length;
        int rStart = 0, rEnd = rows - 1, cMid = cols / 2, rMid;
        while (rStart < rEnd - 1) {
            rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target)
                return true;
            else if (matrix[rMid][cMid] < target)
                rStart = rMid;
            else
                rEnd = rMid;
        }

//        Now we are left with 2 rows in the matrix and we will search in them by dividing them in 4 parts

        if (matrix[rStart][cMid] == target || matrix[rEnd][cMid] == target) {
            return true;
        }

//        Search in first half
        if (matrix[rStart][cMid] > target)
            isPresent = BinarySearch(matrix, rStart, 0, cMid - 1, target);

//        Search in the 2nd half
        if (matrix[rStart][cMid] < target && !isPresent)
            isPresent = BinarySearch(matrix, rStart, cMid + 1, cols - 1, target);

//        Search in the 3rd half
        if (matrix[rEnd][cMid] > target && !isPresent)
            isPresent = BinarySearch(matrix, rEnd, 0, cMid - 1, target);

//        Search in the 4th half
        if (!isPresent)
            isPresent = BinarySearch(matrix, rEnd, cMid + 1, cols - 1, target);
        return isPresent;
    }


    static boolean BinarySearch(int[][] matrix, int row, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[row][mid] == target)
                return true;
            else if (matrix[row][mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}
