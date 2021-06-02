package operators;

import java.util.Scanner;

public class ProductOf2 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 2 double numbers
        Then, find the product of those 2 numbers

        Test Data:
        5.5
        10

        Expected result:
        The product of the entered numbers is = 55.0

        PSEUDO CODE:
        1.Create a Scanner Object to get input from user
        2.Ask user to enter numbers and store those answers in proper variables
        3.Find the product of the given numbers and print result
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        double d1 = scan.nextDouble(), d2 = scan.nextDouble();

        System.out.println("The product of the entered numbers is = " + d1 * d2);
    }
}
