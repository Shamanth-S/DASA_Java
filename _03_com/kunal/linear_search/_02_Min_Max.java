package _03_com.kunal.linear_search;

import java.util.Scanner;

public class _02_Min_Max {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = in.nextInt();
        }

        System.out.print("The elements of the array are: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Minimum in the array is " + min(arr) + "\n");
        System.out.print("Maximum in the array is " + max(arr));
        in.close();
    }

    // Finds minimum
    static int min(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    // Finds maximum
    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
