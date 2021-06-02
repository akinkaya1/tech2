package scanner;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Heyy User! Please enter your name: ");
        String userName = myScanner.next(); // nextLine()

        System.out.println("Heyy User! Would you mind entering your last name as well: ");
        String userLastName = myScanner.next();

        System.out.println("Okay " + userName + " Now, we want to know your fav quote: ");
        String favQuote = myScanner.next(); // This can have only one word, better to use nextLine() with sentences or multiple words

        System.out.println("The name entered by user is " + userName +
                "\nUser's last name is: " + userLastName +
                "\nUser's fav quote is: " + favQuote);
    }
}
