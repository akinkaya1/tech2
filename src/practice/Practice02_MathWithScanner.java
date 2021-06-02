package practice;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Practice02_MathWithScanner {
    public static void main(String[] args) {
        /*
        TASK - 1
        Write a program that asks user to enter 3 numbers (int)
        Then find and print the max and min number

        Expected result:
        The max of entered 3 numbers is =
        The min of entered 3 numbers is =
         */

        System.out.println("---TASK-1---\n");
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 3 numbers: ");
        int i1 = scan.nextInt(), i2 = scan.nextInt(), i3 = scan.nextInt();

        System.out.println("The max of entered 3 numbers is = " + Math.max(Math.max(i1,i2), i3));
        System.out.println("The min of entered 3 numbers is = " + Math.min(Math.min(i1, i2), i3));


        /*
        TASK-2
        Write a program that generates 2 random numbers bt 0 to 10 (0 and 10 included)
        Print random numbers that are generated
        And print min and max numbers
        And print sum and product of those random numbers

        Expected result:
        Random number 1 =
        Random number 2 =
        Max =
        Min =
        Sum =
        Product =

        PSEUDO CODE
        1. Use Math.random() method to generate 2 random numbers, and print the numbers
        2. Use Math.min() and Math.max() to find minimum and maximum numbers
        3. Find the sum of the random numbers and print the result
        4. Find the product of the random numbers and print the result
         */
        System.out.println("\n---TASK-2---\n");

        int r1 = (int)(Math.random() * 11);
        int r2 = (int)(Math.random() * 11);

        System.out.println("Random number 1 = " + r1 +
                "\nRandom number 2 = " + r2 +
                "\nMax = " + Math.max(r1, r2) +
                "\nMin = " + Math.min(r1, r2) +
                "\nSum = " + (r1 + r2) +
                "\nProduct = " + r1 * r2);


        /*
        TASK-3
        Write a program that generates 4 numbers bt 0 and 100 (0 and 100 included)
        And find min and max value of those numbers
        Find average of those numbers

        Expected result:
        Random number 1 =
        Random number 2 =
        Random number 3 =
        Random number 4 =
        Min value of those numbers is =
        Max value of those numbers is =
        Average of those numbers is =

        PSEUDO CODE
        1. Use Math.random() method to generate 4 random numbers, and print the numbers
        2. Use Math.min() and Math.max() to find minimum and maximum numbers
        3. Find average of the random numbers and print the result
         */

        System.out.println("\n---TASK-3---\n");

        int num1 = (int)(Math.random() * 101);
        int num2 = (int)(Math.random() * 101);
        int num3 = (int)(Math.random() * 101);
        int num4 = (int)(Math.random() * 101);

        int max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        int min = Math.min(Math.min(num1, num2), Math.min(num3, num4));
        double average = (double)(num1 + num2 + num3 + num4) / 4;


        System.out.println("Random number 1 = " + num1 +
                "\nRandom number 2 = " + num2 +
                "\nRandom number 3 = " + num3 +
                "\nRandom number 4 = " + num4 +
                "\nMin value of those numbers is = " + min +
                "\nMax value of those numbers is = " + max +
                "\nAverage of those numbers is = " + average);
    }
}
