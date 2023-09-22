package _02_com.kunal.array;

import java.util.Arrays;

public class _04_Array_reverse {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 2, 9, 18, 56 };
        System.out.print("Elements of array before reverse: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println();
        System.out.print("Elements of array after reverse: " + Arrays.toString(arr));
    }

    // Reverse an array
    static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (end > start) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Swapping the position
    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
