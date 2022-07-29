package DSA.Searching.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem12 {
    public static void main(String[] args) {
        int[] arr = {-20, 8, -6, -14, 0, -19, 14, 4};
        System.out.println(CheckIfExist(arr));
    }

    public static boolean CheckIfExist(int[] arr) {
        Set<Integer> temp = new HashSet<>();
        for (int x : arr) {
            if (temp.contains(x))
                return true;
            temp.add(x * 2);
            if (x % 2 == 0) temp.add(x / 2);
        }
        return false;
    }

    //    iska time is O(nlogm)
//    Isme agar 0 do baar ya usse zyada aaye to uske liye alag se condition lagani padegi
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0, end = arr.length - 1, mid;
        for (int x : arr) {
            if (search(arr, x * 2))
                return true;
        }
        return false;
    }

    public static boolean search(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}
