package operators;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 3 int numbers
        Then, find number multiplied with itself for each number given

        Test Data:
        5
        6
        10

        Expected result:
        The 5 multiplied with 5 is = 25
        The 6 multiplied with 6 is = 36
        The 10 multiplied with 10 is = 100

        PSEUDO CODE:
        1.Create a Scanner Object to get input from user
        2.Ask user to enter numbers and store those answers in proper variables
        3.Find their result and print results
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();

        System.out.println("The " + num1 + " multiplied with " + num1 + " is " + num1 * num1
                + "\nThe " + num2 + " multiplied with " + num2 + " is " + num2 * num2
                + "\nThe " + num3 + " multiplied with " + num3 + " is " + num3 * num3);
    }
}
