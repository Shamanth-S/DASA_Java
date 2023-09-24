package _04_com.kunal.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Ceiling_of_a_number {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array(sorted (ascending): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = in.nextInt();
        }

        System.out.print("Elements of the array are: " + Arrays.toString(arr));
        System.out.println();

        System.out.print("Enter the search element: ");
        int search = in.nextInt();

        int result = ceilOfANumber(arr, search);

        if( result != -1) {
            System.out.println("Element found at" + result);
        } else {
            System.out.println("Element not found");
        }
        in.close();
    }

    static int ceilOfANumber(int[] arr, int target) {

        if (target > arr.length - 1) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
        }
        return start;
    }
}
