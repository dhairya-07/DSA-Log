package DSA.Searching.Medium;//package Searching.Easy;


public class SearchinRotatedArray {
    public static void main(String[] args) {
        int[] nums = {2,1,2,2,2};
        int ans = search(nums, 2);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int pivot = FindPivot(nums);
//        pivot =-1 means there is no rotation done
        if (pivot == -1)
            return BinarySearch(nums, target, 0, nums.length - 1);

        if (target == nums[pivot])
            return pivot;
//        Target agar bada hai start se to interval mil gaya from start to end search karne ka
        if (target >= nums[0]) {
            return BinarySearch(nums, target, 0, pivot - 1);
        }
//        Target agar chota hai start se to interval hoga pivot ke aage se end tak
        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static int BinarySearch(int[] nums, int target, int start, int end) {
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static int FindPivot(int[] nums) {
//        pivot means the largest element rotate hoke kaha pohoncha
        int start = 0, end = nums.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if (nums[mid] > nums[start])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
