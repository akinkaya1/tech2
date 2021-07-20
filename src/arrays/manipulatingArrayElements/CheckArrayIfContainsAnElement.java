package arrays.manipulatingArrayElements;

import java.util.Arrays;

public class CheckArrayIfContainsAnElement {
    public static void main(String[] args) {
        /*
        TASK-1
        Find out if fruits array below contains blueberry
        If it contains, then print true
        Else, print false

        NOTE: do not use binarySearch() method
         */

        System.out.println("\n---TASK-1---\n");

        String[] fruits = {"apple", "banana", "strawberry", "apple", "blueberry", "pineapple" , "orange"};

        boolean hasBlueberry = false;

        for(String fruit: fruits){
            if(fruit.equals("blueberry")) {
                hasBlueberry = true;
                break;
            }
        }

        System.out.println(hasBlueberry);
        System.out.println("\n---End of the TASK-1---\n");


        /*
        TASK-2
        Find out if fruits array above contains grapes
        If it contains, then print true
        Else, print false

        NOTE: use binarySearch() method
         */

        System.out.println("\n---TASK-2---\n");

        Arrays.sort(fruits);
        int indexOfGrapes = Arrays.binarySearch(fruits, "grapes");
        System.out.println(indexOfGrapes >= 0);

        System.out.println("\n---End of the TASK-2---\n");


        /*
        TASK-3
        Find out if characters array below contains T
        If it contains, then print true
        Else, print false

        NOTE: do not use binarySearch() method
         */

        char[] characters = {'A', 'b', '&', '8', '@'};

        System.out.println("\n---TASK-3---\n");

        boolean hasT = false;

        for(char c: characters){
            if(c == 'T') {
                hasT = true;
                break;
            }
        }

        System.out.println(hasT);
        System.out.println("\n---End of - TASK-3---\n");

        /*
        TASK-4
        Find out if characters array above contains 8
        If it contains, then print true
        Else, print false

        NOTE: use binarySearch() method
         */

        System.out.println("\n---TASK-4---\n");

        Arrays.sort(characters);
        int indexOf8 = Arrays.binarySearch(characters, '8');

        System.out.println(indexOf8 >= 0);

        System.out.println("\n---End of - TASK-4---\n");
    }
}
