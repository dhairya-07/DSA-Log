package DSA.Arrays.Easy;

public class Problem10 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    //    Efficient than neeche wala in both time and space aspects
    public static boolean checkIfPangram(String sentence) {
        Boolean[] alphabet = new Boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            alphabet[(int) sentence.charAt(i) - 97] = true;
        }
        for (boolean x : alphabet) {
            if (x == false) {
                return false;
            }
        }
        return true;
    }

    static boolean IfPanagram(String sentence) {
        int res = 0;
        for (int i = 0; i < sentence.length(); i++) {
            res |= (1 << (sentence.charAt(i)) - 'a');
        }
        if (res == (1 << 26) - 1)
            return true;
        else
            return false;
    }
}
