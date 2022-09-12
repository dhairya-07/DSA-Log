package DSA.Strings.Easy;

public class Problem2 {
    public static void main(String[] args) {
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String s = "codeleet";
        System.out.println(restoreString(s, indices));
    }

    static String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        int i = 0;
        while (i < indices.length) {
//            int correct = indices[i];
            ch[indices[i]] = s.charAt(i);
            i++;
        }

//        Dono tareeke return karne ke sahi hai
//        return String.valueOf(ch);
        return new String(ch);
    }

}
