package _03_com.kunal.linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Search_in_2D {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns : ");
        int row = in.nextInt();
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i +"][" + j +"] = ");
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

        System.out.print("Enter key to be searched: ");
        int key = in.nextInt();

        int[] ans = answer(arr, key);
        System.out.print(Arrays.toString(ans));
        in.close();
    }

    static int[] answer(int[][] arr,int key) {
        if (arr.length == 0) {
            return new int[] {-1, -1};
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == key) {
                    return new int[]{i, j, key};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
