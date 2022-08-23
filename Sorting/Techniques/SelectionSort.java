package DSA.Sorting.Techniques;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-5, -20, 1, 0, 3, -69};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
//            Finding the max element ka index
            int maxIndex = getMaxIndex(arr, 0, end);
//            Placing it to its correct position i.e at the end of the array
            swap(arr, maxIndex, end);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
