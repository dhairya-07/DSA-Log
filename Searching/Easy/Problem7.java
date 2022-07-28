package DSA.Searching.Easy;

public class Problem7 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        System.out.println(findKthPositive(arr, 5));
    }

//    T=O(n)
    public static int findKthPositive(int[] arr, int k) {
        int flag = 0, num = 1;
        int j = 0;
        while (flag < k) {
            if (num != arr[j]) {
                flag++;
                num++;
            } else if (num == arr[j]) {
                if (j < arr.length - 1) {
                    j++;
                    num++;
                } else
                    num++;
            }
        }
        return num - 1;
    }

//    Using binary search
    public static int FindKthPositive(int[] arr, int k) {
        if(arr[0]>k)
            return k;
        int start=0, end=arr.length-1, mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]-(mid+1)<k)
                start=mid+1;
            else
                end=mid-1;
        }
        return k+end+1;
    }
}
