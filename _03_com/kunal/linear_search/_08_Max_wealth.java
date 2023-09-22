package _03_com.kunal.linear_search;

import java.util.Scanner;

public class _08_Max_wealth {

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
        System.out.print(findWealth(arr));
        in.close();
    }

    static int findWealth(int[][] arr) {

        int ans = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
