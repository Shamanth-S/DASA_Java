package _03_com.kunal.linear_search;

import java.util.Scanner;

public class _01_Linear_search {

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

        System.out.print("Enter the key to be searched: ");
        int key = in.nextInt();

        int element = linearSearch(arr, key);

        if(element != Integer.MAX_VALUE) {
            System.out.println("Element " + element +" is found in the array");
        } else {
            System.out.println("Element " + key + " not found...");
        }
        in.close();
    }

    // Search in array : return if index found
    // otherwise return -1
    static int linearSearch(int[] arr, int key) {

        if ( arr.length == 0) {
            return -1;
        }

        // Logic
        for (int num : arr) {
            if (num == key) {
                return num;
            }
        }
        return Integer.MAX_VALUE;
    }
}
