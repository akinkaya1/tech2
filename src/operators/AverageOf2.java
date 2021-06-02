package operators;

import java.util.Scanner;

public class AverageOf2 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 2 int numbers
        Then, find average of those 2 numbers

        Test Data:
        5
        25

        Expected result:
        Average of entered numbers is = 15

        PSEUDO CODE:
        1.Create a Scanner Object to get input from user
        2.Ask user to enter numbers and store those answers in proper variables
        3.Find average of given numbers and print result
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers: ");
        int number1 = input.nextInt(), number2 = input.nextInt();

        int average = (number1 + number2) / 2;

        System.out.println("The average of given numbers is = " + average);
    }
}
