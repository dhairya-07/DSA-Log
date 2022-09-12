package DSA.Strings.Easy;

public class Problem21 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcdeg", "pqr"));

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        for (; i < word1.length(); i++) {
            sb.append(word1.charAt(i));
        }
        for (; j < word2.length(); j++) {
            sb.append(word2.charAt(j));
        }
        return sb.toString();
    }
}
