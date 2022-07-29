package DSA.Searching.Medium;

public class Problem4 {
    public static void main(String[] args) {
        int[] nums =
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(search(nums, 13));
    }


    public static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid;
        if (nums[start] == target || nums[end] == target)
            return true;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
//            Check if the left side of the array is sorted or not
            else if (nums[start] < nums[mid]) {
                if (nums[start] <= target && target <= nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
//            Check if right part is sorted
//            Although atleast one part will be sorted of the parts will be sorted
            else if (nums[mid] < nums[end]) {
                if (nums[mid] <= target && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
//            When there are duplicates then to avoid them just move one step ahead
            else if(nums[mid]==nums[start])
                start++;
            else
                end--;
        }
        return false;
    }
}
