package DSA.Strings.Easy;

public class Problem14 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
//        haystack.i
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() > haystack.length())
            return -1;
        if (needle.length() == 0)
            return 0;
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + needle.length()).equals(needle))
                    return i;
            }
        }
        return -1;
    }
}
