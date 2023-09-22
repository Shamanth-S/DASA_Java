package _02_com.kunal.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_Array_List {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Array list syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        //Adding a element
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);
        System.out.print("Element of List before updating: ");
        System.out.println(list);

        //Updating
        list.set(0, 99);
        System.out.println();
        System.out.print("Element of List after updating: ");
        System.out.println(list);

        //Removing
        list.remove(2);
        System.out.println();
        System.out.print("List after removing index 2: ");
        System.out.println(list);

        //Itterating
        System.out.println();
        System.out.print("Enter 5 elements into the list array:");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println("Elements of the list after user i/p: " + list);
        System.out.println();

        //Get item at any index
        System.out.print("Elements printed by index: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); //Pass index here, list[index] will not work here
        }
        System.out.println();

        //Multiple array lists
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        //Initializing
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }

        //Adding elements
        System.out.println();
        System.out.println("Enter 3 elements to each array for 2D list array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(in.nextInt());
            }
        }
        System.out.print("Elements of 2D list array: " + list1);
        in.close();
    }
}