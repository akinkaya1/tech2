package operators;

import java.util.Scanner;

public class AverageOf3 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 3 int numbers
        Then, find average of those 3 numbers

        Test Data:
        5
        25
        60

        Expected result:
        Average of 5, 25 and 60 is = 30

        PSEUDO CODE:
        1.Create a Scanner Object to get input from user
        2.Ask user to enter numbers and store those answers in proper variables
        3.Find average of given numbers and print result
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt();

        System.out.println("Average of " + num1 + ", " + num2 + ", and " +  num3 + " is = " + (num1 + num2 + num3) / 3);
    }
}
