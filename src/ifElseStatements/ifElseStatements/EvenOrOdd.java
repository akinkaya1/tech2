package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a number.
        If the number entered is even, then print message “The number you entered is even!”
        If the number entered is odd, then print message “The number you entered is odd!”
         */

        var scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        var number = scanner.nextInt();

        if(number % 2 != 1){
            System.out.println("The number you entered is even!");
        }
        else{
            System.out.println("The number you entered is odd!");
        }
        System.out.println("End of program!");
    }
}
