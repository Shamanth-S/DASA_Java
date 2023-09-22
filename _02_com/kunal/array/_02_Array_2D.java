package _02_com.kunal.array;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Array_2D {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Syntax
        int[][] arr1 = new int[3][3];

        // or
        int[][] arr2 = {
                { 1, 2, 3 },          // 0th index
                { 4, 5 },             // 1st index
                { 6, 7, 8, 9 }        // 2nd index -> arr2]2] = {6, 7, 8, 9}
        };

        // Input for 2D array
        System.out.println("Enter 2D array : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr1[i][j] = in.nextInt();
            }
        }
        System.out.println();

        System.out.println("Printing the array entered by user:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("[" + arr1[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();

        // Enhanched
        System.out.println("Printing the array using array class:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println();

        // Enhanced_2
        System.out.println("Printing the array using for each loop:");
        for (int[] a : arr2) {
            System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}