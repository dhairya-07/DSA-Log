package DSA.Searching.Medium;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println(reachNumber(7));
    }

    public static int reachNumber(int target) {
        int pos = FindClosest(target);
        int steps = (pos * (pos + 1)) / 2;
        if ((steps - target) % 2 == 0)
            return pos;
        int AddedSteps = pos + 1;
        while (((steps + AddedSteps) - target) % 2 != 0) {
            AddedSteps++;
        }
        return AddedSteps;

    }

    static int FindClosest(int target) {
        target = Math.abs(target);
        long start = 1, end = target, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((mid * (mid + 1)) / 2 >= target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return (int) start;
    }
}
