package _04_com.kunal.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Binary_search {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array(sorted (ascending / descending): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = in.nextInt();
        }

        System.out.print("Elements of the array are: " + Arrays.toString(arr));
        System.out.println();

        System.out.print("Enter the search element: ");
        int search = in.nextInt();

        System.out.print("Element found at arr[" + binarySearch(arr, search) + "]");
        in.close();
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] < arr[end]) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
