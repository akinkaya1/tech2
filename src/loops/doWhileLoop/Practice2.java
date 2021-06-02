package loops.doWhileLoop;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter a number
        if number is dividable by 5 then finish the program but
        if number is not dividable by 5, keep asking user to enter
        a new number until user enters a number that is dividable by 5
         */

        var scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Please enter a number: ");
            number = scanner.nextInt();
        }
        while (number % 5 != 0);
        System.out.println("End of the Program");
    }
}
