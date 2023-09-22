package _03_com.kunal.linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class _05_String_search {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String arr = in.nextLine();

        System.out.println("The string is " + Arrays.toString(arr.toCharArray()));

        System.out.print("Enter a character to be searched in the string : ");
        char search = in.next().charAt(0);

        boolean result = stringSearch(arr, search);

        System.out.println("Is the character in given sting is present : " + result);
        in.close();
    }

    static boolean stringSearch(String arr, char search) {

        if (arr.isEmpty()) {
            return false;
        }

        for ( char ch : arr.toCharArray()) {
            if(ch == search) {
                return true;
            }
        }
        return false;
    }
}
