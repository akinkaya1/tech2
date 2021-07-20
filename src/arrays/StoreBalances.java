package arrays;

import java.util.Arrays;

public class StoreBalances {
    public static void main(String[] args) {
        /*
        Create a double array to store below values
        15.5
        16.3
        18
        90
        100.5

        Then print the Array
         */

        double[] value = new double[5];
        value[3] = 21313;
        value[0] = 15.5;
        value[1] = 16.3;
        value[2] = 18;
        value[3] = 90;
        value[4] = 100.5;

        System.out.println(Arrays.toString(value));

        int[] numbers = {1, 5, 8, -15, 30}; // 5

        System.out.println(numbers.length); // 5
        System.out.println(numbers[0]); // 1
        System.out.println(numbers[numbers.length-1]); // 30
        System.out.println(numbers[numbers.length/2]); // 8

    }
}
