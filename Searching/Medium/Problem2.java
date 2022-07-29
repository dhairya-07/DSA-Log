package DSA.Searching.Medium;

public class Problem2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(SingleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int i = 0;
        if (nums.length == 1)
            return nums[0];
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1])
                return nums[i];
            else i = i + 2;
        }
        if (i == nums.length || i == nums.length - 1)
            return nums[nums.length - 1];
        return -1;
    }

    public static int SingleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1, mid;
        if (nums.length == 1)
            return nums[0];
        else if (nums[0] != nums[1])
            return nums[0];
        else if (nums[end] != nums[end - 1])
            return nums[end];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            else if ((((mid % 2 == 1) && nums[mid] == nums[mid - 1])) || ((mid % 2 == 0) && nums[mid] == nums[mid + 1]))
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
