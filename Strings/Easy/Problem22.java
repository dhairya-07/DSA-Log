package DSA.Strings.Easy;

public class Problem22 {
    public static void main(String[] args) {

    }

    public static String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch);
        StringBuilder sb = new StringBuilder();
        sb.append(reverse(word, 0, end));
        sb.append(word.substring(end + 1, word.length()));
        return sb.toString();
    }

    static String reverse(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = end; i >= start; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
