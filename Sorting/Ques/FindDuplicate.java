package DSA.Sorting.Ques;

//Leetcode 287

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
//        Do the cyclic sort because elements are in the range {1,n} and there are n+1 elements so jab sort kaorge
//        to jo duplicate element hoga wo last me pohonch jayega bcoz largest element would be nth element so our ans
//        would be the n+1st element
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
                swap(nums, i, correct);
            else i++;
        }
        return nums[nums.length - 1];
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static int FindDuplicates(int[] nums) {
//      Isme humne ye dekha ki ek given index par (index + 1) wali value hai ki nahi agar nahi hai to usme se use uski
//      correct index par bhejo but agar wo us correct index par value already present hai matlab hume humara
//      duplicate element mil chuka hai
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct])
                    swap(nums, i, correct);
                else return nums[i];
            } else i++;
        }
        return -1;
    }
}
