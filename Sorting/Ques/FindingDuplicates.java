package DSA.Sorting.Ques;

//Leetcode 442

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingDuplicates {
    public static void main(String[] args) {
        int[] nums = {1};
        List<Integer> list = findDuplicates(nums);
        System.out.println(Arrays.toString(list.toArray()));
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

//        Cyclic sort laga ke sort karlo
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
                swap(nums, i, correct);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                list.add(nums[j]);
        }
        return list;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
