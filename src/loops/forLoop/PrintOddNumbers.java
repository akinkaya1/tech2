package loops.forLoop;

import java.util.Scanner;

public class PrintOddNumbers {
    /*
    Write a Java program to ask user to enter a number and print all the odd numbers starting from 0 to given number by user (0 and given number is included)

    Test data:
    15

    Expected output:
    1
    3
    5
    .
    .
    .
    13
    15

    startPoint = 0
    endPoint = number given by user
    update = post-increment (i++)
    */

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            if(i % 2 != 0) System.out.println(i);
        }

        System.out.println("End of the program");
    }
}
