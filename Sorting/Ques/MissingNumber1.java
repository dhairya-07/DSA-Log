package DSA.Sorting.Ques;

//Leetcode 268

public class MissingNumber1 {
    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 4, 5, 3, 0, 1, 7};
//        System.out.println(findMissing(arr));
//        FindMissing(arr);
        System.out.println(FindMissing(arr));
    }

    static int findMissing(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int expectedSum = (n * (n + 1)) / 2;
        return expectedSum - sum;
    }

    static int FindMissing(int[] nums) {
        int i = 0;
        while (i < nums.length) {
//            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[nums[i]])
                swap(nums, i, nums[i]);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
