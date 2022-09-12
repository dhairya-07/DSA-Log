package DSA.Strings.Easy;

public class Problem16 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
//        System.out.println("raceacar".equals("racaecar"));
//        String
    }

    //   Dono methods ache hai
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append((char) (s.charAt(i) + 32));
            } else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                sb.append(s.charAt(i));
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    //2 Pointer Approach
    public static boolean isPalindrome2(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
