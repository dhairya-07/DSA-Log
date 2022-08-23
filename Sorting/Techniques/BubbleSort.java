package DSA.Sorting.Techniques;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

//    This is sorting in ascending order --> descending ke liye if condition reverse kar dena
    static void bubble(int[] arr) {
//        create a boolean to see agar i ki kisi bhi iteration me koi bhi swaps nahi hue to matlab array is sorted
        boolean swapped;
//        Run for n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            For each pass max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
//                    Swap the elements
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
//            Check if swapping occurred or not
            if (!swapped)
                break;
        }
    }
}
