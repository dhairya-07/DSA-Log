package DSA.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem18 {
    public static void main(String[] args) {
        int[] num = {5, 2, 8, 8, 2};
        System.out.println(addToArrayForm(num, 8));

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                list.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            } else {
                list.add(k % 10);
                k = k / 10;
            }
            i--;
        }

        Collections.reverse(list);
        return list;
    }
}
