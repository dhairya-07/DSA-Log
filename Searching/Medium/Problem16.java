package DSA.Searching.Medium;

public class Problem16 {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(isPossible(weights, 8));
        System.out.println(shipWithinDays(weights, 5));
//        System.out.println(isPossible(weights, 6, 3));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int x : weights) {
            max = Math.max(max, x);
            sum += x;
        }
        if (days == weights.length)
            return max;

        int start = max, end = sum, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isPossible(weights, mid, days))
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }

    static boolean isPossible(int[] weights, int mid, int deadline) {
        int days = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if (sum > mid) {
//                days++ means 1 extra din ki zaroorat pad gayi
                days++;
                sum = weights[i];
            }
        }
        return days <= deadline;
    }
}
