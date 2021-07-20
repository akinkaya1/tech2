package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        /*
        Create an array to store
        10, 45, -32, 0, 0, 34
        sort the array and print it

        PSEUDO CODE
        1. create the array and store values given
        2. sort the array
        3. print the array
         */

        int[] numbers = {10, 45, -32, 0, 0, 34}; // -32, 0, 0, 10, 34, 45

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        /*
        TASK
        Create an array to store below names
        alex
        Adam
        Maryna
        Jo
        Tom

        Sort the array and print the array
         */
        String[] names = {"alex", "Adam", "Maryna", "Jo", "Tom"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        /*
        TASK
        Create an array to store below characters
        %
        y
        ^
        *
        Space
        A
        E
        Sort the array and print the array
         */

        char[] chars = {'%', 'y', '^', '*', ' ', 'A', 'E'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
    }
}
