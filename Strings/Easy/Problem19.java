package DSA.Strings.Easy;

public class Problem19 {
    public static void main(String[] args) {
        int ans = maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba",
                "aaaba");
        System.out.println(ans);
    }

//    Que is word ki kitni repetition wali substring(without breaking) is present in the sequence
    static int maxRepeating(String sequence, String word) {
        StringBuilder sb = new StringBuilder(word);
        int ans = 0;
        while (sequence.contains(sb)) {
            ans++;
            sb.append(word);
        }
        return ans;
    }
}
