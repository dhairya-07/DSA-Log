package DSA.Strings.Easy;

import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        for (List<String> list : items) {
            switch (ruleKey) {
                case "type":
                    if (list.get(0).equals(ruleValue))
                        cnt++;
                    break;
                case "color":
                    if (list.get(1).equals(ruleValue))
                        cnt++;
                    break;
                case "name":
                    if (list.get(2).equals(ruleValue))
                        cnt++;
                    break;
            }
        }
        return cnt;
    }

    //    Least time
    static int CountMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        int idx = -1;
        switch (ruleKey) {
            case "type":
                idx = 0;
                break;
            case "color":
                idx = 1;
                break;
            case "name":
                idx = 2;
                break;
        }
        for (List<String> list : items) {
            if (list.get(idx).equals(ruleValue))
                cnt++;
        }
        return cnt;
    }
}
