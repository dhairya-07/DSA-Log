package DSA.Searching.Easy;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int ans = BinarySearch(arr, 1);
        int ans = mySqrt(48);
        System.out.println(ans);
    }

    public static int mySqrt(int x) {

        int start = 1, end = x/2, mid;
        if (x == 1 || x == 0)
            return x;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == x)
                return mid;
            if (mid * mid > x)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return end;
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (target > arr[arr.length - 1])
                return -1;
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
        }
        return end;
    }
}
