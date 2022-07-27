package DSA.Arrays.Easy;

import java.util.Arrays;

public class Problem13 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        for (int[] arr : FlipAndInvertImage(image)) {
            System.out.println(Arrays.toString(arr));
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] inverted = image;

        for (int[] arr : inverted) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[j];
                arr[j] = arr[n - j - 1];
                arr[n - j - 1] = temp;
            }
        }

        for (int[] arr : inverted) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0)
                    arr[i] = 1;
                else
                    arr[i] = 0;
            }
        }

        return inverted;
    }

    //    XOR operator se values saath saath invert bhi ho jayengi
//    Is method ke liye andar wala loop 0<=j<n+1/2 tak chalega kyunki agar wo middle wali row me ayega nahi to middle
//    row ki values invert nahi hongi as hum 1 hi loop me sab kar rahe hai
    public static int[][] FlipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n - j - 1] ^ 1;
                image[i][n - j - 1] = temp;
            }
        }

        return image;
    }
}
