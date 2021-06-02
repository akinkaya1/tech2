package stringMethods;

import java.util.Scanner;

public class LengthPractice {
    public static void main(String[] args) {
        /**
        Write a Java program that asks user to enter their favorite book's name and quote
        And store answers of user in different Strings
        Finally, print the length of those Strings
         */

        var scanner = new Scanner(System.in);
        System.out.println("What is your fav book?");
        String book = scanner.nextLine();

        System.out.println("What is fav quote?");
        String quote = scanner.nextLine();

        System.out.println("The length of the book name is = " + book.length());
        System.out.println("The length of the quote name is = " + quote.length());
    }
}
