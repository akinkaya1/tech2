package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RecapArray {
    public static void main(String[] args) {

        /*
        Create an int array to store 1, 5, 7, 9, 10
        Then, print each number
         */


        System.out.println("\n---Task-1 - numbers array---\n");
        int[] numbers = {1, 5, 7, 9, 10};
        for (int number : numbers) {
            System.out.println(number);
        }


        /*
        Convert this numbers array to an ArrayList and print ArrayList
         */
        System.out.println("\n---Task-2 - numbers ArrayList---\n");
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int number : numbers) {
            numbersList.add(number);
        }

        System.out.println("My number list = " + numbersList);
    }
}
