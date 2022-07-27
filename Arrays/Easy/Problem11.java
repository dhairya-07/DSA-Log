package DSA.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class Problem11 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");
        items.add(list1);

        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
        items.add(list2);

        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");
        items.add(list3);

        System.out.println(CountMatches(items, "color", "silver"));
    }

    //    Just one test case failed wo bhi bakchodi wala
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for (List<String> list : items) {
            if (list.contains(ruleValue))
                ans++;
        }
        return ans;
    }

    public static int CountMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for (List<String> list : items) {
            switch (ruleKey) {
                case "type":
                    if (list.get(0).equals(ruleValue))
                        ans++;
                    break;
                case "color":
                    if (list.get(1).equals(ruleValue))
                        ans++;
                    break;
                case "name":
                    if (list.get(2).equals(ruleValue))
                        ans++;
                    break;
            }
        }
        return ans;
    }

    //    Optimised
    static int Countmatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue))
                    ans++;
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue))
                    ans++;
            }
        } else if (ruleKey.equals("name")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue))
                    ans++;
            }
        }
        return ans;
    }
}
