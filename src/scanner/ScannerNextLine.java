package scanner;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        /**
         Requirements
        Ask user to enter their full name and their favorite quote
        And then, print those information

        PSEUDO CODE
        1. Create a Scanner object
        2. Ask user to enter those information
        3. Store the data in proper containers
        4. Print information that you got
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Please enter your fav quote: ");
        String favQuote = input.nextLine();

        System.out.println("User's full name is: " + fullName);
        System.out.println("User's fav quote is: " + favQuote);

        System.out.println("\nEnd of the program");
    }
}
