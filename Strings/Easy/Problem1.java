package DSA.Strings.Easy;

public class Problem1 {
    public static void main(String[] args) {
//        StringBuilder build = new StringBuilder("Dhairya Srivastava");
        String address = "1.1.1.1";
        System.out.println(Method1(address));
    }

    public static String Method1(String address) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                sb.append("[.]");
            else
                sb.append("1");
        }
        return sb.toString();
    }

    public static String Method2(String address) {

        return address.replace(".", "[.]");

//        Ye andar jo hai wo 1 regular expression hai to find . and replace with [.]
//        return address.replaceAll("\\.", "\\[.]\");
    }
}
