package stringMethods;

import java.util.Scanner;

public class FirstAndLastCharsPractice {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a full sentence
        Print first and last characters in the entered sentence
         */

        var scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println("First char is = " + sentence.charAt(0));
        System.out.println();
    }
}
