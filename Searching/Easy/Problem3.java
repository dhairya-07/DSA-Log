package DSA.Searching.Easy;

public class Problem3 {
    public static void main(String[] args) {

    }

    //    Leetcode ne apni isBadVersion API use ki hai ye bass dummy function hai
    static boolean isBadVersion(int nums) {
        if (nums == 1)
            return false;
        return true;
    }

    public int firstBadVersion(int n) {
        int start = 1, end = n, mid;
        // int ans=-1;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (!isBadVersion(mid))
                start = mid + 1;
            else {
                // ans=mid;
                end = mid;
            }
        }
        return start;
    }
}
