package DSA.Strings.Easy;

public class Problem6 {
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab","c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        for (String x : word1) {
            sb1.append(x);
        }
        for (String x : word2)
            sb2.append(x);
        return sb1.toString().equals(sb2.toString());
    }
}
