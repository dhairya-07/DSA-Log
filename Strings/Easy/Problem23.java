package DSA.Strings.Easy;

public class Problem23 {
    public static void main(String[] args) {

    }

    public static int romanToInt(String s) {
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'I') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                    ans += 9;
                    i += 2;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    ans += 4;
                    i += 2;
                } else {
                    ans += 1;
                    i++;
                }
            } else if (s.charAt(i) == 'V') {
                ans += 5;
                i++;
            } else if (s.charAt(i) == 'X') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    ans += 40;
                    i += 2;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    ans += 90;
                    i += 2;
                } else {
                    ans += 10;
                    i++;
                }
            } else if (s.charAt(i) == 'L') {
                ans += 50;
                i++;
            } else if (s.charAt(i) == 'C') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    ans += 400;
                    i += 2;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                    ans += 900;
                    i += 2;
                } else {
                    ans += 100;
                    i++;
                }
            } else if (s.charAt(i) == 'D') {
                ans += 500;
                i++;
            } else if (s.charAt(i) == 'M') {
                ans += 1000;
                i++;
            }
        }
        return ans;
    }
}
