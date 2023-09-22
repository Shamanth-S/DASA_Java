package _02_com.kunal.array;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Array_Intro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Store 5 roll numbers
        int roll_no1 = 23;
        int roll_no2 = 24;
        int roll_no3 = 25;
        int roll_no4 = 26;
        int roll_no5 = 27;

        System.out.println("roll_no1: " + roll_no1);
        System.out.println("roll_no2: " + roll_no2);
        System.out.println("roll_no3: " + roll_no3);
        System.out.println("roll_no4: " + roll_no4);
        System.out.println("roll_no5: " + roll_no5);
        System.out.println();

        // Syntax
        int[] roll_no6 = new int[5];

        //Input using for loop
        System.out.print("Enter 5 array elements: ");
        for (int i = 0; i < roll_no6.length; i++) {
            roll_no6[i] = scan.nextInt();
        }

        //Printing Array using array class
        System.out.print("roll_no6: ");
        System.out.println(Arrays.toString(roll_no6));
        System.out.println();

        // Or directly
        int[] roll_no7 = { 1, 2, 3, 4, 5 };

        //Printing using loops
        System.out.print("roll_no7: ");
        for (int number : roll_no7) {        // for every element in array, print the element
            System.out.print(number + " ");  // here number represents element of the array
        }
        System.out.println();

        int[] roll_no8;         // Declaration of array: roll_no8 is getting defined in the stack;
        roll_no8 = new int[5];  // Initialization: actually here object is being created in the memory (heap memory)

        System.out.println();
        System.out.print("roll_no8: " + roll_no8[0]);
        System.out.println();

        //String array
        System.out.println();
        String[] arr = new String[4];
        System.out.println("String array: " + arr[0] + " ");

        //Passing array as parameter
        int[] nums = {3, 4, 5, 12};
        System.out.println();
        System.out.print("Array before change: " + Arrays.toString(nums));
        System.out.println();
        change(nums);
        System.out.print("Array after change: " + Arrays.toString(nums));

        scan.close();
    }

    //Function to change the array
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
