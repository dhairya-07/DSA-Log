package DSA.Strings.Easy;

public class Problem25 {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        int cnt = 0;
        String s1 = s.trim();
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) == ' ') {
                break;
            }
            cnt++;
        }
        return cnt;
    }
}
