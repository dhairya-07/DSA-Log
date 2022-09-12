package DSA.Strings.Easy;

public class Problem9 {
    public static void main(String[] args) {
//String s="10#11#12";
        System.out.println(freqAlphabets("1326#"));
    }

    static String freqAlphabets(String s) {
        int i = 0, j = i + 2;
//        char ch = 'a';
        StringBuilder sb = new StringBuilder("");
        while (i < s.length()) {
            if (j < s.length()) {
                if (s.charAt(j) == '#') {
                    sb.append((char) ('a' + Integer.valueOf(s.substring(i, j)) - 1));
                    i = j + 1;
                    j = i + 2;
                } else {
                    sb.append((char) ('a' + Integer.valueOf(s.substring(i, i + 1)) - 1));
                    i++;
                    j++;
                }
            } else {
                sb.append((char) ('a' + Integer.valueOf(s.substring(i, i + 1)) - 1));
                i++;
            }
        }
        return sb.toString();
    }
}
