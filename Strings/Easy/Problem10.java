package DSA.Strings.Easy;

public class Problem10 {
    public static void main(String[] args) {
        String[] patters = {"a", "a", "a"};
        System.out.println(numOfStrings(patters, "ab"));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for (String str : patterns) {
            if (word.contains(str))
                ans++;
        }
        return ans;
    }
}
