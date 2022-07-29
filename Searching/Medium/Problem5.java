package DSA.Searching.Medium;

public class Problem5 {
    public static void main(String[] args) {
        int[] temp = {3, 4, 5, 1, 2};
        System.out.println(findMin(temp));
//        findMin(temp);
    }

    static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1, mid;
        if (nums[start] <= nums[end])
            return nums[0];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            else if (mid > start && nums[mid] < nums[mid - 1])
                return nums[mid];
            else if (nums[mid] >= nums[start])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return nums[0];
    }
}
