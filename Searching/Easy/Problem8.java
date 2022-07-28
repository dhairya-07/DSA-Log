package DSA.Searching.Easy;

public class Problem8 {
    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(CountNegatives(grid));
    }

    //  T = O(nlog(m))
    public static int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] arr : grid) {
            ans += FindCeling(arr, 0);
        }
        return ans;
    }

    static int FindCeling(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr.length - 1 - end;
    }

//    T = O(n+m) --> This is better approach
    public static int CountNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int i=m-1, j=0;
        while(i>=0&&j<n){
            if(grid[i][j]<0){
                ans+=n-j;
                i--;
            }
            else
                j++;
        }
        return ans;
    }

}
