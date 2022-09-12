package DSA.Strings.Easy;

import java.util.Arrays;

public class Problem11 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LLRU"));
    }

    public static boolean judgeCircle(String moves) {
        if (moves.length() == 0)
            return true;
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'L')
                x--;
            else if (move == 'R')
                x++;
            else if (move == 'U')
                y++;
            else y--;
        }
        return x == 0 && y == 0;
    }
}
