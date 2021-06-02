package ifElseStatements.ternaryOperator;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 number and print out the smallest number
        Use ternary operator to solve the problem

        Test data:
        Number1 = 12
        Number2 = 17

        Expected output:
        17
         */
        var scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        var num1 = scanner.nextInt();
        var num2 = scanner.nextInt();
        var smallest = num1 < num2 ? num1 : num2;

        System.out.println("The smallest is = " + smallest);
        System.out.println("End of the program!");

    }
}
