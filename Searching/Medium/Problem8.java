package DSA.Searching.Medium;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println(maxValue(3, 0, 815094800));
    }

    public static int maxValue(int n, int index, int maxSum) {
        long start = 1, end = maxSum, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            long Sum = sum(mid - 1, n - index - 1, index);
//            System.out.println("mid-" + mid + "left+right-" + Sum);
            if (mid + Sum <= maxSum)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int) end;
    }

    //    To be continued
    static long sum(long x, long rightElements, long leftElements) {
        long leftSum = 0, rightSum = 0;
        if (rightElements > x) {
            rightSum = (x * (x + 1)) / 2 + rightElements - x;
        } else rightSum = (x * (x + 1)) / 2 - ((x - rightElements) * (x - rightElements + 1)) / 2;

        if (leftElements > x) {
            leftSum = (x * (x + 1)) / 2 + leftElements - x;
        } else
            leftSum = (x * (x + 1)) / 2 - ((x - leftElements) * (x - leftElements + 1)) / 2;

        return leftSum + rightSum;

    }
}
