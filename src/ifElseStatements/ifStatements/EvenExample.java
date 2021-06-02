package ifElseStatements.ifStatements;

import java.util.Scanner;

public class EvenExample {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a number.
        If the number entered is even, then print message “The number you entered is even!”

        PSEUDO CODE
        1. Create a Scanner Object
        2. Ask user to enter a number and store the answer in proper variable
        3. Check if the number is even
        4. If number is even, then print “The number you entered is even!”

        Even => number % 2 == 0 or number % 2 != 1
        Odd => number % 2 != 0 or number % 2 == 1
         */

        var scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        var number = scanner.nextInt(); // 15

        if(number % 2 == 0){
            System.out.println("The number you entered is even!");
        }

        System.out.println("End of the program!");
    }
}
