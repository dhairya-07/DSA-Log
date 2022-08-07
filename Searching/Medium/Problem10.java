package DSA.Searching.Medium;

public class Problem10 {
    public static void main(String[] args) {
        int[] piles = {805306368, 805306368, 805306368};
        System.out.println(minEatingSpeed(piles,
                1000000000));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = Integer.MAX_VALUE, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isPossible(piles, h, mid)) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return start;
    }

    static boolean isPossible(int[] piles, int h, int speed) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
//            1.0 se multiply isliye kiya taki hume decimal form mil jaye us number ka jiska ceil nikalna hai
            time += (int) Math.ceil(piles[i] * 1.0 / speed);
//            time += piles[i] / speed;
//            if (piles[i] % speed != 0)
//                time++;
        }
        return time <= h;
    }
}
