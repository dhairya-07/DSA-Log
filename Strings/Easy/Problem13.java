package DSA.Strings.Easy;

public class Problem13 {
    public static void main(String[] args) {
//        System.out.println(1000 % 26);
        System.out.println(convertToTitle(52));
    }

    public static String convertToTitle(int columnNumber) {
        return giveChar(columnNumber);
    }

    static String giveChar(int num) {
        StringBuilder sb = new StringBuilder("");
        if (num <= 26) {
            char c = (char) (64 + num);
            return String.valueOf(c);
        } else {
            sb.append(giveChar((num - 1) / 26));
            int perc = (num - 1) % 26;
            sb.append((char) (65 + perc));
        }
        return sb.toString();
    }

    static String convertToTitle2(int colNumber) {
        StringBuilder sb = new StringBuilder("");
        int n = colNumber, perc = 0;
        while (n > 26) {
            perc = (n - 1) % 26 + 65;
            sb.append((char) (perc));
            n = (n - 1) / 26;
        }
        sb.append((char) (64 + n));
        return sb.reverse().toString();
    }

}
