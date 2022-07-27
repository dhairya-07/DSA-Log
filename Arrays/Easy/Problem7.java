package DSA.Arrays.Easy;

public class Problem7 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(IdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    cnt++;
            }
        }
        return cnt;
    }

    static int IdenticalPairs(int[] nums) {
        int res = 0;
        int[] temp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            res += temp[nums[i]];
            temp[nums[i]]++;
        }
        return res;
    }
}
