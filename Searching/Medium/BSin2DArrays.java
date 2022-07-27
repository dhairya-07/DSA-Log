package DSA.Searching.Medium;

import java.util.Arrays;

public class BSin2DArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(FindInMatrix(matrix, 11)));
    }

    //    This is for unsorted matrix
    static int[] BSin2DArray(int[][] arr, int target) {
        int start = 0;
        int end = arr[1].length - 1;
        while (start < arr.length && end > 0) {
            if (arr[start][end] == target)
                return new int[]{start, end};
            else if (arr[start][end] > target)
                end--;
            else
                start++;
        }
        return new int[]{-1, -1};
    }

    //    This is simple binary search for the row and between the columns we give
    static int[] search(int[][] arr, int row, int cStart, int cEnd, int target) {
        int mid = 0;
        while (cStart <= cEnd) {
            mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] == target)
                return new int[]{row, mid};
            if (arr[row][mid] > target)
                cEnd = mid - 1;
            else
                cStart = mid + 1;
        }
        return new int[]{-1, -1};
    }

    //    For sorted matrix
    static int[] FindInMatrix(int[][] arr, int target) {
        int row = arr.length, col = arr[0].length;
//        We just started with the middle row as reference
        int cMid = col / 2;
        int rStart = 0, rEnd = row - 1;

//        doing binary search among rows till 2 consecutive rows are obtained
        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target)
                return new int[]{mid, cMid};
            if (arr[mid][cMid] > target)
                rEnd = mid;
            else
                rStart = mid;
        }

//        Checking if middle column me element hai ki nahi
        if (arr[rStart][cMid] == target)
            return new int[]{rStart, cMid};

        //       Checking if middle column me element hai ki nahi
        if (arr[rStart + 1][cMid] == target)
            return new int[]{rStart + 1, cMid};

//        Now checking the the 4 sections that are left apart from the middle column of the 2 consecutive rows
//        Check the 1st half
        if (target < arr[rStart][cMid])
            return search(arr, rStart, 0, cMid - 1, target);

//        Check the 2nd half
        if (target > arr[rStart][cMid])
            return search(arr, rStart, cMid + 1, col - 1, target);

//        Check the 3rd half
        if (target < arr[rStart + 1][cMid])
            return search(arr, rStart + 1, 0, cMid - 1, target);

//        Check the 4th half
        else
            return search(arr, rStart + 1, cMid + 1, col - 1, target);
    }

}
