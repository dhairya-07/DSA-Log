package DSA.Sorting.Ques;

//Leetcode 448

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MissingNumber2 {
    public static void main(String[] args) {
        int[] nums = {};
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
                swap(nums, i, correct);
            else i++;
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                list.add(j + 1);
        }
        return list;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}