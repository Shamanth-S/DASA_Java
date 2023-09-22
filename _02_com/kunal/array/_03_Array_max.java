package _02_com.kunal.array;

public class _03_Array_max {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 2, 9, 18, 56 };
        System.out.println("Max of array using max function: " + max(arr));
        System.out.println("Max of array using max range(0, 4) function: " + maxRange(arr, 0, 4));

    }

    // Max element in an array
    static int max(int arr[]) {

        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Max value in a range, work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (start > end) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
