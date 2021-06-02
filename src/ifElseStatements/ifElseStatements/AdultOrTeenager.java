package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class AdultOrTeenager {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their age
        if age is more than 19, then print "You are an adult"
        else, print "You are a teenager"
         */

        var scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");

        //Ternary operator is a short-hand if else statement
        String message = scanner.nextInt() > 19 ? "You are an adult" : "You are a teenager";
        System.out.println(message);
        System.out.println("End of the program!");
    }
}
