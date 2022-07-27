package DSA.Searching.Easy;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(guessNumber(5));
    }


    //    Leetcode ki apni guess API use ki thi ye bass 1 dummy function hai
    static int guess(int num) {
        return num;
    }

    //    Ye hai ans
    public static int guessNumber(int n) {
        boolean bool = false;
        int start = 1, end = n, mid = 0;
        while (!bool) {
            mid = start + (end - start) / 2;
            if (guess(mid) == 0) {
                bool = true;
            } else if (guess(mid) == -1) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return mid;
    }
}
