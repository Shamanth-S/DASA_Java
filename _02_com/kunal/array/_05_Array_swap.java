package _02_com.kunal.array;

import java.util.Arrays;

public class _05_Array_swap {

    public static void main(String[] args) {

        int[] arr = {1, 3, 23, 9, 18};

        System.out.print("Before swapping: " + Arrays.toString(arr));
        swap(arr, 0, 4);
        System.out.println();
        System.out.print("After swapping: " + Arrays.toString(arr));
    }

    //Swapping the position
    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
