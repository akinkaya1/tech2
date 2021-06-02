package stringMethods;

import java.util.Scanner;

public class CharAtPractice {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their name
        Find first and second chars in the name
        And print these chars
         */

        var scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.next();

        System.out.println("First letter is = " + name.charAt(0));
        System.out.println("Second letter is = " + name.charAt(1));
    }
}
