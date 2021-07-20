package arrays;

import java.util.Arrays;

public class StoreNumbers {
    public static void main(String[] args) {
        /*
        create an array to store 1, 2, 3
        print array

        and then reassign all the values to be 5
        and print array once again
         */

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        String firstArray = Arrays.toString(numbers); // [1, 2, 3]
        System.out.println("First array: " + firstArray);

        numbers[0] = 5;
        numbers[1] = 5;
        numbers[2] = 5;

        String secondArray = Arrays.toString(numbers);
        System.out.println("Second array: " + secondArray);

        System.out.println("The size of the array is = " + numbers.length);
    }
}
