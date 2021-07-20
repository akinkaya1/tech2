package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {
        String[] objects = {"Remote", "Mouse","Mouse", "Keyboard", "iPad"}; // Keyboard, Mouse, Mouse, Remote, iPad, quarter

        Arrays.sort(objects); //to be able to search in an array, we need to sort it first

        int search = Arrays.binarySearch(objects, "Mouse");

        System.out.println(search);

        /*
        Find if below array has 10
        if it has 10, then print "This array has 10"
        it it does not has 10, then print "This array does not have 10"

        0, 1, 2, 3
         */

        double[] numbers = {10.5, 15, 10, 20};
        Arrays.sort(numbers);

        int indexOf10 = Arrays.binarySearch(numbers, 10);

        if(indexOf10 < 0) System.out.println("This array does not have 10");
        else System.out.println("This array has 10");
    }
}
