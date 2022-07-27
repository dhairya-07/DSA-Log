package DSA.Searching.Easy;

public class Problem5 {
    public static void main(String[] args) {

    }

    public int arrangeCoins(int n) {
        long start = 1, end = n, mid;
        if (n == 1)
            return 1;
        while (start < end) {
            mid = start + (end - start) / 2;
            if ((mid * (mid + 1) / 2 > n))
                end = mid;
            else if ((mid) * (mid + 1) / 2 < n)
                start = mid + 1;
            else
                return (int) mid;
        }
        return (int) end - 1;
    }
}
