package _03_com.kunal.linear_search;

import java.util.Scanner;

public class _03_Even_digits {

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

        System.out.print("The number of even numbers are: " + findNumbers(arr));
        in.close();
    }

    static int findNumbers(int[] arr) {

        int count = 0;

        for (int num : arr) {
            if (even(num)) {
                count += 1;
            }
        }

        return count;
    }


    static boolean even(int num) {
        int number = digits(num);

        return number % 2 == 0;
    }

    static int digits(int num) {

        if (num < 0) {
            num *= -1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
