package _04_com.kunal.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Infinite_array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array(sorted (ascending ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = in.nextInt();
        }

        System.out.print("Elements of the array are: " + Arrays.toString(arr));
        System.out.println();

        System.out.print("Enter the search element: ");
        int search = in.nextInt();

        System.out.print(Arrays.toString(findRange(arr, search)));
        System.out.println();
        in.close();
    }

    public static int[] findRange(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return new int[]{infiniteArray(arr, target, start, end)};
    }
    public static int infiniteArray(int[] arr, int target, int start, int end) {

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
        return -1;
    }
}
