package DSA.Arrays.Easy;

public class Problem16 {
    public static void main(String[] args) {
        int[] nums = {437, 315, 322, 431, 686, 264, 442};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            int cnt = (int) Math.log10(x)+1;
            if (cnt % 2 == 0)
                ans++;
        }
        return ans;
    }
}
