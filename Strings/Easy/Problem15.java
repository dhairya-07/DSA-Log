package DSA.Strings.Easy;

public class Problem15 {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleexa"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length())
            return false;
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j))
                i++;
            else if (typed.charAt(j) != typed.charAt(j - 1))
                return false;
            j++;
        }
        //         Final check tabhi pata lagega jab i ne poora iterate kar liye ho agar i last character par raha
        //         matlab last character in name is missing in typed
        return i == name.length();
    }
}
