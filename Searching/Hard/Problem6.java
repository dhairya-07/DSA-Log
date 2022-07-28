package DSA.Searching.Hard;

public class Problem6 {
    public static void main(String[] args) {
        int[] mount = {1, 5, 2};
        System.out.println(findInMountainArray(0, mount));
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = FindPeak(mountainArr);
        int idx = search(mountainArr, target, 0, peak - 1, true);
        if (idx >= 0)
            return idx;
        else
            return search(mountainArr, target, peak + 1, mountainArr.length - 1, false);
    }

    public static int FindPeak(int[] mountainArr) {
        int start = 0, end = mountainArr.length - 1, mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
//        System.out.println("peak is " + start);
        return start;
    }

    public static int search(int[] mountainArr, int target, int start, int end, boolean flag) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] == target)
                return mid;
            else if (mountainArr[mid] > target) {
                if (flag)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (flag)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

}
