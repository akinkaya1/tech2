package ifElseStatements.switchStatements;

import java.util.Scanner;

public class Numbers1To5 {
    /*
    Write a Java program that asks user to enter a number from 1 to 5 (1 and 5 are included)
    Based on the selection print the result
    Use switch statement to solve the problem
    Print “Number entered is not in the range” if user enters any other number
     */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Please enter a number bt 1 to 5");
        var number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Number entered " + number);
                break;
            case 2:
                System.out.println("Number entered " + number);
                break;
            case 3:
                System.out.println("Number entered " + number);
                break;
            case 4:
                System.out.println("Number entered " + number);
                break;
            case 5:
                System.out.println("Number entered " + number);
                break;
            default:
                System.out.println(number + " entered is not in the range!");
        }
    }
}
