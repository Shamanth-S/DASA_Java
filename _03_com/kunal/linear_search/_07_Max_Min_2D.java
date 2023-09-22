package _03_com.kunal.linear_search;

import java.util.Scanner;

public class _07_Max_Min_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns : ");
        int row = in.nextInt();
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Elements are : ");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.print("The minimum in the 2D array is: " + min(arr) + "\n");
        System.out.print("The maximum in the 2D array is: " + max(arr));
        in.close();
    }

    static int max(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    static int min(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;
    }
}
