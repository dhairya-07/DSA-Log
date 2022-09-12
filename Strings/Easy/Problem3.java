package DSA.Strings.Easy;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(Interpret("G()(al)"));
    }

    static String interpret(String command) {
        String str = command.replace("()", "o");
//        String str1 = str.replace("(al)", "al");
        return new String(str.replace("(al)", "al"));
    }

    static String Interpret(String command) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                sb.append("G");
            else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i++;
                } else {
                    sb.append("al");
                    i+=3;
                }
            }
        }
        return sb.toString();
    }
}
