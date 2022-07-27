package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem28 {
    public static void main(String[] args) {
        int[] position = {6, 4, 7, 8, 2, 10, 2, 7, 9, 7};
        System.out.println(MinCostToMoveChips(position));
    }

    static int MinCostToMoveChips(int[] position) {
        int cost = 0;
        int maxOccur = 0;
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 1)
                oddCount++;
            else
                evenCount++;
        }
        if (oddCount > evenCount)
            maxOccur = 1;
        else maxOccur = 2;
        for (int i = 0; i < position.length; i++) {
            if ((position[i] - maxOccur) % 2 == 1 || (position[i] + maxOccur) % 2 == 1)
                cost++;
        }
        return cost;
    }
}