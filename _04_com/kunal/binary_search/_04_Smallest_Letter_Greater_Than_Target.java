package _04_com.kunal.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Smallest_Letter_Greater_Than_Target {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        char[] arr = new char[n];

        System.out.println("Enter the elements of the array(sorted ascending): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = in.next().charAt(0);
        }

        System.out.print("Elements of the array are: " + Arrays.toString(arr));
        System.out.println();

        System.out.print("Enter the search element: ");
        char search = in.next().charAt(0);

        System.out.println(smallestLetter(arr, search));

        in.close();
    }

    public static char smallestLetter(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
