package DSA.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem6 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extracandies = 3;
        List<Boolean> list = new ArrayList<Boolean>();
        list = kidsWithCandies(candies, extracandies);
        System.out.println(list);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }
        return list;
    }
}



