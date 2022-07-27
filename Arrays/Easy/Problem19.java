package DSA.Arrays.Easy;

public class Problem19 {
    public static void main(String[] args) {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        System.out.println(MaximumPopulation(logs));
    }

//    T=O(n^2)
    public static int maximumPopulation(int[][] logs) {
//        Since birth year - death year ki range is 1950-2050 --> 101years(101 bcoz 1950 and 2050 are included)
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - 1950]++;
            }
        }
        int maxVal = 0, maxYear = 1950;
        for (int i = 0; i < (logs[logs.length - 1][1] - 1950); i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }

//    T=O(n)
    public static int MaximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0]-1950]++;
            arr[logs[i][1]-1950]--;
        }

//        Running sum
        for (int i = 1; i < 101; i++) {
            arr[i] += arr[i - 1];
        }

        int maxVal = 0, maxYear = 1950;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}
